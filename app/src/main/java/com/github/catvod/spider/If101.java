package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge1.OH;
import com.github.catvod.spider.merge1.a0;
import com.github.catvod.spider.merge1.aJ;
import com.github.catvod.spider.merge1.oe;
import com.github.catvod.spider.merge1.oy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class If101 extends Spider {
    private JSONObject o;
    private JSONObject yE;
    private Pattern by = Pattern.compile("/index.php/vod/type/id/(\\d+).html");
    private Pattern OC = Pattern.compile("/index.php/vod/detail/id/(\\d+).html");
    private Pattern vu = Pattern.compile("/index.php/vod/play/id/(\\d+)/sid/(\\d+)/nid/(\\d+).html");
    private Pattern gi = Pattern.compile("\\S+/page/(\\d+)\\S+");

    /* JADX WARN: Code restructure failed: missing block: B:36:0x011a, code lost:
        r1 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[Catch: Exception -> 0x01b9, TryCatch #0 {Exception -> 0x01b9, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x0016, B:11:0x0022, B:12:0x0038, B:14:0x0049, B:16:0x004f, B:17:0x0057, B:19:0x005d, B:21:0x006f, B:22:0x008c, B:25:0x00c6, B:27:0x00cd, B:29:0x00d3, B:31:0x00e1, B:32:0x00e4, B:34:0x010c, B:37:0x011b, B:39:0x0128, B:40:0x012e, B:42:0x0134, B:45:0x016d, B:46:0x018d, B:47:0x0190, B:49:0x01a5, B:50:0x01aa, B:51:0x01ac), top: B:56:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6 A[Catch: Exception -> 0x01b9, TRY_ENTER, TryCatch #0 {Exception -> 0x01b9, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x0016, B:11:0x0022, B:12:0x0038, B:14:0x0049, B:16:0x004f, B:17:0x0057, B:19:0x005d, B:21:0x006f, B:22:0x008c, B:25:0x00c6, B:27:0x00cd, B:29:0x00d3, B:31:0x00e1, B:32:0x00e4, B:34:0x010c, B:37:0x011b, B:39:0x0128, B:40:0x012e, B:42:0x0134, B:45:0x016d, B:46:0x018d, B:47:0x0190, B:49:0x01a5, B:50:0x01aa, B:51:0x01ac), top: B:56:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0128 A[Catch: Exception -> 0x01b9, TryCatch #0 {Exception -> 0x01b9, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x0016, B:11:0x0022, B:12:0x0038, B:14:0x0049, B:16:0x004f, B:17:0x0057, B:19:0x005d, B:21:0x006f, B:22:0x008c, B:25:0x00c6, B:27:0x00cd, B:29:0x00d3, B:31:0x00e1, B:32:0x00e4, B:34:0x010c, B:37:0x011b, B:39:0x0128, B:40:0x012e, B:42:0x0134, B:45:0x016d, B:46:0x018d, B:47:0x0190, B:49:0x01a5, B:50:0x01aa, B:51:0x01ac), top: B:56:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a5 A[Catch: Exception -> 0x01b9, TryCatch #0 {Exception -> 0x01b9, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x0016, B:11:0x0022, B:12:0x0038, B:14:0x0049, B:16:0x004f, B:17:0x0057, B:19:0x005d, B:21:0x006f, B:22:0x008c, B:25:0x00c6, B:27:0x00cd, B:29:0x00d3, B:31:0x00e1, B:32:0x00e4, B:34:0x010c, B:37:0x011b, B:39:0x0128, B:40:0x012e, B:42:0x0134, B:45:0x016d, B:46:0x018d, B:47:0x0190, B:49:0x01a5, B:50:0x01aa, B:51:0x01ac), top: B:56:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01aa A[Catch: Exception -> 0x01b9, TryCatch #0 {Exception -> 0x01b9, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x0016, B:11:0x0022, B:12:0x0038, B:14:0x0049, B:16:0x004f, B:17:0x0057, B:19:0x005d, B:21:0x006f, B:22:0x008c, B:25:0x00c6, B:27:0x00cd, B:29:0x00d3, B:31:0x00e1, B:32:0x00e4, B:34:0x010c, B:37:0x011b, B:39:0x0128, B:40:0x012e, B:42:0x0134, B:45:0x016d, B:46:0x018d, B:47:0x0190, B:49:0x01a5, B:50:0x01aa, B:51:0x01ac), top: B:56:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String categoryContent(java.lang.String r12, java.lang.String r13, boolean r14, java.util.HashMap<java.lang.String, java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.If101.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    public String detailContent(List<String> list) {
        String str;
        Exception e;
        aJ yE;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String OC;
        String OC2;
        String Jw;
        String Jw2;
        OH Oo;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        String str7;
        String str8;
        aJ aJVar;
        String str9;
        boolean z;
        oe oeVar;
        Matcher matcher;
        String str10;
        String str11 = "";
        try {
            String str12 = "https://oulevod.tv/index.php/vod/detail/id/" + list.get(0) + ".html";
            yE = oy.yE(a0.F(str12, o(str12)));
            jSONObject = new JSONObject();
            jSONObject2 = new JSONObject();
            OC = yE.aV("a.digg_link").OC("data-id");
            OC2 = yE.aV("div.hl-dc-pic span").OC("data-original");
            Jw = yE.aV("h2.hl-dc-title").Jw();
            Jw2 = yE.aV("span.hl-content-text em").Jw();
            Oo = yE.Oo("li.hl-col-xs-12 em");
            str2 = str11;
            str3 = str2;
            str4 = str3;
            str5 = str4;
            str6 = str5;
            i = 0;
            str7 = str6;
        } catch (Exception e2) {
            e = e2;
            str = str11;
        }
        while (true) {
            str8 = str11;
            aJVar = yE;
            if (i >= Oo.size() - 2) {
                break;
            }
            try {
                oe oeVar2 = Oo.get(i);
                String Jw3 = oeVar2.Jw();
                OH oh = Oo;
                if (Jw3.contains("类型")) {
                    try {
                        str4 = oeVar2.H().Oo("a").v();
                        str10 = Jw2;
                    } catch (Exception unused) {
                        str10 = Jw2;
                        str4 = str8;
                    }
                } else {
                    str10 = Jw2;
                    if (Jw3.contains("年份")) {
                        try {
                            str5 = oeVar2.H().Jw().split("：")[1];
                        } catch (Exception unused2) {
                            str5 = str8;
                        }
                    } else if (Jw3.contains("地区")) {
                        try {
                            str6 = oeVar2.H().Jw().split("：")[1];
                        } catch (Exception unused3) {
                            str6 = str8;
                        }
                    } else if (Jw3.contains("上映")) {
                        try {
                            str3 = oeVar2.Jw();
                        } catch (Exception unused4) {
                            str3 = str8;
                        }
                    } else if (Jw3.contains("导演")) {
                        try {
                            str2 = oeVar2.H().Oo("a").v();
                        } catch (Exception unused5) {
                            str2 = str8;
                        }
                    } else if (Jw3.contains("主演")) {
                        try {
                            str7 = oeVar2.H().Oo("a").v();
                        } catch (Exception unused6) {
                            str7 = str8;
                        }
                    }
                }
                i++;
                str11 = str8;
                yE = aJVar;
                Oo = oh;
                Jw2 = str10;
            } catch (Exception e3) {
                e = e3;
            }
            e = e3;
            str = str8;
            SpiderDebug.log(e);
            return str;
        }
        String str13 = Jw2;
        jSONObject2.put("vod_id", OC);
        jSONObject2.put("vod_name", Jw);
        jSONObject2.put("vod_pic", OC2);
        jSONObject2.put("type_name", str4);
        jSONObject2.put("vod_year", str5);
        jSONObject2.put("vod_area", str6);
        jSONObject2.put("vod_remarks", str3);
        jSONObject2.put("vod_actor", str7);
        jSONObject2.put("vod_director", str2);
        jSONObject2.put("vod_content", str13);
        try {
            TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.github.catvod.spider.If101.1
                public int compare(String str14, String str15) {
                    try {
                        int i2 = If101.this.yE.getJSONObject(str14).getInt("or");
                        int i3 = If101.this.yE.getJSONObject(str15).getInt("or");
                        return (i2 != i3 && i2 - i3 <= 0) ? -1 : 1;
                    } catch (JSONException e4) {
                        SpiderDebug.log(e4);
                        return 1;
                    }
                }
            });
            OH Oo2 = aJVar.Oo("div.hl-plays-from a");
            OH Oo3 = aJVar.Oo("div.hl-list-wrap");
            int i2 = 0;
            while (i2 < Oo2.size()) {
                str = str8;
                try {
                    String replaceAll = Oo2.get(i2).Jw().replaceAll("[^一-龥]", str);
                    Iterator<String> keys = this.yE.keys();
                    while (true) {
                        if (!keys.hasNext()) {
                            str9 = replaceAll;
                            z = false;
                            break;
                        }
                        str9 = keys.next();
                        if (this.yE.getJSONObject(str9).getString("sh").equals(replaceAll)) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        OH Oo4 = Oo3.get(i2).Oo("ul>li>a");
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < Oo4.size(); i3++) {
                            if (this.vu.matcher(Oo4.get(i3).OC("href")).find()) {
                                arrayList.add(oeVar.Jw() + "$" + (matcher.group(1) + "/sid/" + matcher.group(2) + "/nid/" + matcher.group(3)));
                            }
                        }
                        String join = arrayList.size() > 0 ? TextUtils.join("#", arrayList) : str;
                        if (join.length() != 0) {
                            treeMap.put(str9, join);
                        }
                    }
                    i2++;
                    str8 = str;
                } catch (Exception e4) {
                    e = e4;
                }
            }
            str = str8;
            if (treeMap.size() > 0) {
                String join2 = TextUtils.join("$$$", treeMap.keySet());
                String join3 = TextUtils.join("$$$", treeMap.values());
                jSONObject2.put("vod_play_from", join2);
                jSONObject2.put("vod_play_url", join3);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e5) {
            e = e5;
        }
    }

    public String homeContent(boolean z) {
        int i;
        try {
            aJ yE = oy.yE(a0.F("https://oulevod.tv", o("https://oulevod.tv")));
            OH Oo = yE.Oo("div.conch-nav div ul li a");
            JSONArray jSONArray = new JSONArray();
            Iterator<oe> it = Oo.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                oe next = it.next();
                String Jw = next.Jw();
                if (Jw.equals("电影") || Jw.equals("电视剧") || Jw.equals("动漫") || Jw.equals("综艺") || Jw.equals("纪录片") || Jw.equals("体育")) {
                    i = 1;
                }
                if (i != 0) {
                    Matcher matcher = this.by.matcher(next.OC("href"));
                    if (matcher.find()) {
                        String trim = matcher.group(1).trim();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type_id", trim);
                        jSONObject.put("type_name", Jw);
                        jSONArray.put(jSONObject);
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            if (z) {
                jSONObject2.put("filters", this.o);
            }
            jSONObject2.put("class", jSONArray);
            try {
                OH Oo2 = yE.Oo("ul.hl-vod-list").get(0).Oo("li.hl-list-item");
                JSONArray jSONArray2 = new JSONArray();
                while (i < Oo2.size()) {
                    oe oeVar = Oo2.get(i);
                    String Jw2 = oeVar.aV("div.hl-item-title a").Jw();
                    String OC = oeVar.aV(".hl-item-thumb").OC("data-original");
                    String Jw3 = oeVar.aV(".hl-pic-text span").Jw();
                    Matcher matcher2 = this.OC.matcher(oeVar.aV("div.hl-item-title a").OC("href"));
                    if (matcher2.find()) {
                        String group = matcher2.group(1);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("vod_id", group);
                        jSONObject3.put("vod_name", Jw2);
                        jSONObject3.put("vod_pic", OC);
                        jSONObject3.put("vod_remarks", Jw3);
                        jSONArray2.put(jSONObject3);
                    }
                    i++;
                }
                jSONObject2.put("list", jSONArray2);
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            return jSONObject2.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public void init(Context context) {
        super.init(context);
        try {
            this.yE = new JSONObject("{\"if101\":{\"sh\":\"蓝光播放\",\"sn\":0,\"pu\":\"\",\"or\":999}}");
            this.o = new JSONObject("{\"1\":[{\"key\":\"tid\",\"name\":\"分类\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"冒险\",\"v\":\"6\"},{\"n\":\"剧情\",\"v\":\"7\"},{\"n\":\"动作\",\"v\":\"8\"},{\"n\":\"动画电影\",\"v\":\"9\"},{\"n\":\"同性\",\"v\":\"10\"},{\"n\":\"喜剧\",\"v\":\"11\"},{\"n\":\"奇幻\",\"v\":\"12\"},{\"n\":\"恐怖\",\"v\":\"20\"},{\"n\":\"悬疑\",\"v\":\"21\"},{\"n\":\"惊悚\",\"v\":\"22\"},{\"n\":\"战争\",\"v\":\"23\"},{\"n\":\"歌舞\",\"v\":\"24\"},{\"n\":\"灾难\",\"v\":\"25\"},{\"n\":\"爱情\",\"v\":\"26\"},{\"n\":\"犯罪\",\"v\":\"27\"},{\"n\":\"科幻\",\"v\":\"28\"},{\"n\":\"经典\",\"v\":\"29\"},{\"n\":\"网络电影\",\"v\":\"30\"}]},{\"key\":\"class\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"枪战\",\"v\":\"枪战\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"文艺\",\"v\":\"文艺\"},{\"n\":\"微电影\",\"v\":\"微电影\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"农村\",\"v\":\"农村\"},{\"n\":\"儿童\",\"v\":\"儿童\"},{\"n\":\"网络电影\",\"v\":\"网络电影\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]},{\"key\":\"lang\",\"name\":\"语言\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"英语\",\"v\":\"英语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"闽南语\",\"v\":\"闽南语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"日语\",\"v\":\"日语\"},{\"n\":\"法语\",\"v\":\"法语\"},{\"n\":\"德语\",\"v\":\"德语\"},{\"n\":\"其它\",\"v\":\"其它\"}]},{\"key\":\"version\",\"name\":\"版本\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"高清版\",\"v\":\"高清版\"},{\"n\":\"剧场版\",\"v\":\"剧场版\"},{\"n\":\"抢先版\",\"v\":\"抢先版\"},{\"n\":\"OVA\",\"v\":\"OVA\"},{\"n\":\"TV\",\"v\":\"TV\"},{\"n\":\"影院版\",\"v\":\"影院版\"}]},{\"key\":\"state\",\"name\":\"资源\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"正片\",\"v\":\"正片\"},{\"n\":\"预告片\",\"v\":\"预告片\"},{\"n\":\"花絮\",\"v\":\"花絮\"}]},{\"key\":\"letter\",\"name\":\"字母\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"}]},{\"key\":\"by\",\"name\":\"By\",\"value\":[{\"n\":\"按最新\",\"v\":\"time\"},{\"n\":\"按最热\",\"v\":\"hits\"},{\"n\":\"按评分\",\"v\":\"score\"}]}],\"2\":[{\"key\":\"tid\",\"name\":\"分类\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"欧美剧\",\"v\":\"13\"},{\"n\":\"日剧\",\"v\":\"14\"},{\"n\":\"韩剧\",\"v\":\"15\"},{\"n\":\"国产剧\",\"v\":\"16\"},{\"n\":\"泰剧\",\"v\":\"31\"},{\"n\":\"港剧\",\"v\":\"32\"},{\"n\":\"台剧\",\"v\":\"33\"},{\"n\":\"新马剧\",\"v\":\"34\"},{\"n\":\"其它剧\",\"v\":\"35\"}]},{\"key\":\"class\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]},{\"key\":\"lang\",\"name\":\"语言\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"英语\",\"v\":\"英语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"闽南语\",\"v\":\"闽南语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"日语\",\"v\":\"日语\"},{\"n\":\"其它\",\"v\":\"其它\"}]},{\"key\":\"version\",\"name\":\"版本\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"高清版\",\"v\":\"高清版\"},{\"n\":\"剧场版\",\"v\":\"剧场版\"},{\"n\":\"抢先版\",\"v\":\"抢先版\"},{\"n\":\"OVA\",\"v\":\"OVA\"},{\"n\":\"TV\",\"v\":\"TV\"},{\"n\":\"影院版\",\"v\":\"影院版\"}]},{\"key\":\"state\",\"name\":\"资源\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"正片\",\"v\":\"正片\"},{\"n\":\"预告片\",\"v\":\"预告片\"},{\"n\":\"花絮\",\"v\":\"花絮\"}]},{\"key\":\"letter\",\"name\":\"字母\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"}]},{\"key\":\"by\",\"name\":\"By\",\"value\":[{\"n\":\"按最新\",\"v\":\"time\"},{\"n\":\"按最热\",\"v\":\"hits\"},{\"n\":\"按评分\",\"v\":\"score\"}]}],\"3\":[{\"key\":\"tid\",\"name\":\"分类\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"欧美动漫\",\"v\":\"36\"},{\"n\":\"日本动漫\",\"v\":\"37\"},{\"n\":\"韩国动漫\",\"v\":\"38\"},{\"n\":\"国产动漫\",\"v\":\"39\"},{\"n\":\"新马泰动漫\",\"v\":\"40\"},{\"n\":\"港台动漫\",\"v\":\"41\"},{\"n\":\"其他动漫\",\"v\":\"42\"}]},{\"key\":\"class\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"选秀\",\"v\":\"选秀\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"访谈\",\"v\":\"访谈\"},{\"n\":\"播报\",\"v\":\"播报\"},{\"n\":\"旅游\",\"v\":\"旅游\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"美食\",\"v\":\"美食\"},{\"n\":\"纪实\",\"v\":\"纪实\"},{\"n\":\"曲艺\",\"v\":\"曲艺\"},{\"n\":\"生活\",\"v\":\"生活\"},{\"n\":\"游戏互动\",\"v\":\"游戏互动\"},{\"n\":\"财经\",\"v\":\"财经\"},{\"n\":\"求职\",\"v\":\"求职\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"港台\",\"v\":\"港台\"},{\"n\":\"日韩\",\"v\":\"日韩\"},{\"n\":\"欧美\",\"v\":\"欧美\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]},{\"key\":\"lang\",\"name\":\"语言\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"英语\",\"v\":\"英语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"闽南语\",\"v\":\"闽南语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"日语\",\"v\":\"日语\"},{\"n\":\"其它\",\"v\":\"其它\"}]},{\"key\":\"letter\",\"name\":\"字母\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"}]},{\"key\":\"by\",\"name\":\"By\",\"value\":[{\"n\":\"按最新\",\"v\":\"time\"},{\"n\":\"按最热\",\"v\":\"hits\"},{\"n\":\"按评分\",\"v\":\"score\"}]}],\"4\":[{\"key\":\"tid\",\"name\":\"分类\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"欧美综艺\",\"v\":\"43\"},{\"n\":\"日本综艺\",\"v\":\"44\"},{\"n\":\"韩国综艺\",\"v\":\"45\"},{\"n\":\"国产综艺\",\"v\":\"46\"},{\"n\":\"新马泰综艺\",\"v\":\"47\"},{\"n\":\"港台综艺\",\"v\":\"48\"},{\"n\":\"其他综艺\",\"v\":\"49\"}]},{\"key\":\"class\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"热血\",\"v\":\"热血\"},{\"n\":\"推理\",\"v\":\"推理\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"萝莉\",\"v\":\"萝莉\"},{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"机战\",\"v\":\"机战\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"少年\",\"v\":\"少年\"},{\"n\":\"少女\",\"v\":\"少女\"},{\"n\":\"社会\",\"v\":\"社会\"},{\"n\":\"原创\",\"v\":\"原创\"},{\"n\":\"亲子\",\"v\":\"亲子\"},{\"n\":\"益智\",\"v\":\"益智\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国产\",\"v\":\"国产\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]},{\"key\":\"lang\",\"name\":\"语言\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"国语\",\"v\":\"国语\"},{\"n\":\"英语\",\"v\":\"英语\"},{\"n\":\"粤语\",\"v\":\"粤语\"},{\"n\":\"闽南语\",\"v\":\"闽南语\"},{\"n\":\"韩语\",\"v\":\"韩语\"},{\"n\":\"日语\",\"v\":\"日语\"},{\"n\":\"其它\",\"v\":\"其它\"}]},{\"key\":\"version\",\"name\":\"版本\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"TV版\",\"v\":\"TV版\"},{\"n\":\"电影版\",\"v\":\"电影版\"},{\"n\":\"OVA版\",\"v\":\"OVA版\"},{\"n\":\"真人版\",\"v\":\"真人版\"}]},{\"key\":\"letter\",\"name\":\"字母\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"}]},{\"key\":\"by\",\"name\":\"By\",\"value\":[{\"n\":\"按最新\",\"v\":\"time\"},{\"n\":\"按最热\",\"v\":\"hits\"},{\"n\":\"按评分\",\"v\":\"score\"}]}],\"50\":[{\"key\":\"letter\",\"name\":\"字母\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"}]},{\"key\":\"by\",\"name\":\"By\",\"value\":[{\"n\":\"按最新\",\"v\":\"time\"},{\"n\":\"按最热\",\"v\":\"hits\"},{\"n\":\"按评分\",\"v\":\"score\"}]}],\"51\":[{\"key\":\"letter\",\"name\":\"字母\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"A\",\"v\":\"A\"},{\"n\":\"B\",\"v\":\"B\"},{\"n\":\"C\",\"v\":\"C\"},{\"n\":\"D\",\"v\":\"D\"},{\"n\":\"E\",\"v\":\"E\"},{\"n\":\"F\",\"v\":\"F\"},{\"n\":\"G\",\"v\":\"G\"},{\"n\":\"H\",\"v\":\"H\"},{\"n\":\"I\",\"v\":\"I\"},{\"n\":\"J\",\"v\":\"J\"},{\"n\":\"K\",\"v\":\"K\"},{\"n\":\"L\",\"v\":\"L\"},{\"n\":\"M\",\"v\":\"M\"},{\"n\":\"N\",\"v\":\"N\"},{\"n\":\"O\",\"v\":\"O\"},{\"n\":\"P\",\"v\":\"P\"},{\"n\":\"Q\",\"v\":\"Q\"},{\"n\":\"R\",\"v\":\"R\"},{\"n\":\"S\",\"v\":\"S\"},{\"n\":\"T\",\"v\":\"T\"},{\"n\":\"U\",\"v\":\"U\"},{\"n\":\"V\",\"v\":\"V\"},{\"n\":\"W\",\"v\":\"W\"},{\"n\":\"X\",\"v\":\"X\"},{\"n\":\"Y\",\"v\":\"Y\"},{\"n\":\"Z\",\"v\":\"Z\"}]},{\"key\":\"by\",\"name\":\"By\",\"value\":[{\"n\":\"按最新\",\"v\":\"time\"},{\"n\":\"按最热\",\"v\":\"hits\"},{\"n\":\"按评分\",\"v\":\"score\"}]}]}");
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
    }

    protected HashMap<String, String> o(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("method", "GET");
        hashMap.put("Host", "oulevod.tv");
        hashMap.put("Upgrade-Insecure-Requests", "1");
        hashMap.put("DNT", "1");
        hashMap.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36");
        hashMap.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        hashMap.put("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
        return hashMap;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String str3 = "https://oulevod.tv/index.php/vod/play/id/" + str2 + ".html";
            OH Oo = oy.yE(a0.F(str3, o(str3))).Oo("script");
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            while (true) {
                if (i >= Oo.size()) {
                    break;
                }
                String trim = Oo.get(i).Ve().trim();
                if (trim.startsWith("var player_")) {
                    JSONObject jSONObject2 = new JSONObject(trim.substring(trim.indexOf(123), trim.lastIndexOf(125) + 1));
                    if (this.yE.has(jSONObject2.getString("from"))) {
                        JSONObject jSONObject3 = this.yE.getJSONObject(jSONObject2.getString("from"));
                        String string = jSONObject2.getString("url");
                        String string2 = jSONObject3.getString("pu");
                        jSONObject.put("parse", jSONObject3.getInt("sn"));
                        jSONObject.put("playUrl", string2);
                        jSONObject.put("url", string);
                        jSONObject.put("header", "");
                    }
                } else {
                    i++;
                }
            }
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            String str2 = "https://oulevod.tv/index.php/ajax/suggest?mid=1&wd=" + URLEncoder.encode(str) + "&limit=10&timestamp=" + System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject(a0.F(str2, o(str2)));
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (jSONObject.getInt("total") > 0) {
                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("list"));
                for (int i = 0; i < jSONArray2.length(); i++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                    String string = jSONObject3.getString("id");
                    String string2 = jSONObject3.getString("name");
                    String string3 = jSONObject3.getString("pic");
                    if (string2.contains(str)) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("vod_id", string);
                        jSONObject4.put("vod_name", string2);
                        jSONObject4.put("vod_pic", string3);
                        jSONObject4.put("vod_remarks", "");
                        jSONArray.put(jSONObject4);
                    }
                }
            }
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
