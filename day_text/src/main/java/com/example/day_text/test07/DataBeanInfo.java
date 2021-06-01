package com.example.day_text.test07;

import java.io.Serializable;
import java.util.List;

public class DataBeanInfo implements Serializable {
    @Override
    public String toString() {
        return "DataBean{" +
                "data=" + data +
                ", errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":18473,"link":"https://blog.csdn.net/willway_wang/article/details/117245071?spm=1001.2014.3001.5501","niceDate":"41分钟前","niceShareDate":"41分钟前","origin":"","prefix":"","projectLink":"","publishTime":1622439468000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622439468000,"shareUser":"willwaywang6","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android筑基&mdash;&mdash;Gson 框架学习笔记","type":0,"userId":833,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":18468,"link":"https://juejin.cn/post/6968084138125590541/","niceDate":"16小时前","niceShareDate":"16小时前","origin":"","prefix":"","projectLink":"","publishTime":1622383714000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622383714000,"shareUser":"RicardoMJiang","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"【带着问题学】关于LeakCanary2.0的四个问题","type":0,"userId":13971,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":18466,"link":"https://mp.weixin.qq.com/s/umN0saur3pezrtCqKpxJ6A","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1622352392000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622352392000,"shareUser":"onlyloveyd","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"还在用 ZXing ? 试试华为统一扫码服务吧！","type":0,"userId":897,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18469,"link":"https://mp.weixin.qq.com/s/AguM2NYfflEKin6Nr75XPQ","niceDate":"1天前","niceShareDate":"15小时前","origin":"","prefix":"","projectLink":"","publishTime":1622304000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1622384875000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"一个困惑很久的问题，Android中有子窗口吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18471,"link":"https://mp.weixin.qq.com/s/3xoms9zu77UFCJmNOF9ZUw","niceDate":"1天前","niceShareDate":"15小时前","origin":"","prefix":"","projectLink":"","publishTime":1622304000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1622384912000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"ConstraintLayout2.0一篇写不完之MotionLabel","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18470,"link":"https://mp.weixin.qq.com/s/Ne298l-oqCjLjqaHv0_nRA","niceDate":"2天前","niceShareDate":"15小时前","origin":"","prefix":"","projectLink":"","publishTime":1622217600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1622384896000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"ConstraintLayout2.0一篇写不完之MotionEffect","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18458,"link":"https://juejin.cn/post/6844904094503550984/","niceDate":"2021-05-28 09:24","niceShareDate":"2021-05-28 09:24","origin":"","prefix":"","projectLink":"","publishTime":1622165073000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622165073000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"HTTPS及加密算法，看这一篇就够了 ","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18454,"link":"https://juejin.cn/post/6967039557220958244","niceDate":"2021-05-28 02:46","niceShareDate":"2021-05-28 02:46","origin":"","prefix":"","projectLink":"","publishTime":1622141161000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622141161000,"shareUser":"彭旭锐","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android | Jetpack 处理回退事件的新姿势 &mdash;&mdash; OnBackPressedDispatcher","type":0,"userId":30587,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":423,"chapterName":"Architecture","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18450,"link":"https://www.jianshu.com/p/94108191eac3","niceDate":"2021-05-28 00:29","niceShareDate":"2021-05-27 20:30","origin":"","prefix":"","projectLink":"","publishTime":1622132982000,"realSuperChapterId":422,"selfVisible":0,"shareDate":1622118656000,"shareUser":"深红骑士","superChapterId":423,"superChapterName":"Jetpack","tags":[],"title":"深度解读 Jetpack 框架的基石 - AppCompat","type":0,"userId":29303,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>之前看文章，经常看到一些分析 Dialog、PopupWindow的文章，有些文章分析如下：<\/p>\r\n<p><strong>Dialog有自己独立的Window，而PopupWindow没有，所以PopupWindow可以称之为子窗口，而 Dialog不是。<\/strong><\/p>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>这种说法合理吗？<\/li>\r\n<li>在Android中，有没有子窗口的概念呢？如果有到底应该以什么为标准呢？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18192,"link":"https://wanandroid.com/wenda/show/18192","niceDate":"2021-05-28 00:29","niceShareDate":"2021-05-06 00:15","origin":"","prefix":"","projectLink":"","publishTime":1622132956000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1620231346000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Android中的子窗口到底指的是什么？","type":0,"userId":2,"visible":1,"zan":10},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>对于 Intent 大家肯定都不陌生，今天我们聊一聊它的一个近亲：<strong>PendingIntent<\/strong><\/p>\r\n<p>官方对其描述为：<\/p>\r\n<p>A description of an Intent and target action to perform with it. <\/p>\r\n<p>那么问题来了：<\/p>\r\n<ol>\r\n<li>PendingIntent 仅仅是对 Intent 的一个封装吗？<\/li>\r\n<li>如果1 不是，那么为什么 PendingIntent与 Intent 有何不同，它的定位是什么样的呢？<\/li>\r\n<li>对于 2 的回答，如果从源码侧佐证？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18072,"link":"https://www.wanandroid.com/wenda/show/18072","niceDate":"2021-05-28 00:29","niceShareDate":"2021-04-24 22:58","origin":"","prefix":"","projectLink":"","publishTime":1622132946000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1619276317000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 已经有了 Intent，那为啥还要 PendingIntent?","type":0,"userId":2,"visible":1,"zan":7},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18449,"link":"https://juejin.cn/post/6966858553583730718","niceDate":"2021-05-27 15:26","niceShareDate":"2021-05-27 15:26","origin":"","prefix":"","projectLink":"","publishTime":1622100405000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622100405000,"shareUser":"sweetying","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"&quot;一篇就够&quot;系列：Android Emoji 表情分享和实践","type":0,"userId":5405,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18448,"link":"https://juejin.cn/post/6966807721878224933/","niceDate":"2021-05-27 11:35","niceShareDate":"2021-05-27 11:35","origin":"","prefix":"","projectLink":"","publishTime":1622086523000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622086523000,"shareUser":"xll","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"LeetCode刷题笔记1366通过投票对团队排名","type":0,"userId":22903,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18447,"link":"https://juejin.cn/post/6844904082583322632","niceDate":"2021-05-27 10:54","niceShareDate":"2021-05-27 10:54","origin":"","prefix":"","projectLink":"","publishTime":1622084056000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622084056000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"时间复杂度和空间复杂度","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18445,"link":"https://mp.weixin.qq.com/s/MhHTKwywee_GQBOKqZv3Eg","niceDate":"2021-05-27 09:35","niceShareDate":"2021-05-27 09:35","origin":"","prefix":"","projectLink":"","publishTime":1622079310000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622079310000,"shareUser":"程序员徐公","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"View 事件分发机制，看这一篇就够了","type":0,"userId":5339,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18451,"link":"https://mp.weixin.qq.com/s/7vWg3epsXIH3hFeohkNUag","niceDate":"2021-05-27 00:00","niceShareDate":"2021-05-27 22:23","origin":"","prefix":"","projectLink":"","publishTime":1622044800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1622125420000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android 事件分发中你可能忽略掉的点！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18452,"link":"https://mp.weixin.qq.com/s/NEKiAPZnJjgwBHU5o-WS0g","niceDate":"2021-05-27 00:00","niceShareDate":"2021-05-27 22:23","origin":"","prefix":"","projectLink":"","publishTime":1622044800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1622125435000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"从AGP构建过程到APK打包过程","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":169,"chapterName":"gradle","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18438,"link":"https://juejin.cn/post/6966526844552085512","niceDate":"2021-05-26 21:35","niceShareDate":"2021-05-26 21:33","origin":"","prefix":"","projectLink":"","publishTime":1622036133000,"realSuperChapterId":150,"selfVisible":0,"shareDate":1622035986000,"shareUser":"鸿洋","superChapterId":60,"superChapterName":"开发环境","tags":[],"title":"补齐Android技能树 - 从害怕到玩转Android代码混淆","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":198,"chapterName":"基础概念","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18439,"link":"https://juejin.cn/post/6966223613057826852","niceDate":"2021-05-26 21:34","niceShareDate":"2021-05-26 21:33","origin":"","prefix":"","projectLink":"","publishTime":1622036069000,"realSuperChapterId":167,"selfVisible":0,"shareDate":1622036037000,"shareUser":"鸿洋","superChapterId":168,"superChapterName":"基础知识","tags":[],"title":"聊聊 Context 的一些知识点","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18436,"link":"https://juejin.cn/post/6966508665633243172/","niceDate":"2021-05-26 16:13","niceShareDate":"2021-05-26 16:13","origin":"","prefix":"","projectLink":"","publishTime":1622016814000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622016814000,"shareUser":"飞一般的感觉","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"【Gradle学习指南】Groovy基本语法","type":0,"userId":34408,"visible":1,"zan":0}],"offset":0,"over":false,"pageCount":528,"size":20,"total":10553}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        /**
         * curPage : 1
         * datas : [{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":18473,"link":"https://blog.csdn.net/willway_wang/article/details/117245071?spm=1001.2014.3001.5501","niceDate":"41分钟前","niceShareDate":"41分钟前","origin":"","prefix":"","projectLink":"","publishTime":1622439468000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622439468000,"shareUser":"willwaywang6","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android筑基&mdash;&mdash;Gson 框架学习笔记","type":0,"userId":833,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":18468,"link":"https://juejin.cn/post/6968084138125590541/","niceDate":"16小时前","niceShareDate":"16小时前","origin":"","prefix":"","projectLink":"","publishTime":1622383714000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622383714000,"shareUser":"RicardoMJiang","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"【带着问题学】关于LeakCanary2.0的四个问题","type":0,"userId":13971,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":18466,"link":"https://mp.weixin.qq.com/s/umN0saur3pezrtCqKpxJ6A","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1622352392000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622352392000,"shareUser":"onlyloveyd","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"还在用 ZXing ? 试试华为统一扫码服务吧！","type":0,"userId":897,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18469,"link":"https://mp.weixin.qq.com/s/AguM2NYfflEKin6Nr75XPQ","niceDate":"1天前","niceShareDate":"15小时前","origin":"","prefix":"","projectLink":"","publishTime":1622304000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1622384875000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"一个困惑很久的问题，Android中有子窗口吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18471,"link":"https://mp.weixin.qq.com/s/3xoms9zu77UFCJmNOF9ZUw","niceDate":"1天前","niceShareDate":"15小时前","origin":"","prefix":"","projectLink":"","publishTime":1622304000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1622384912000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"ConstraintLayout2.0一篇写不完之MotionLabel","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18470,"link":"https://mp.weixin.qq.com/s/Ne298l-oqCjLjqaHv0_nRA","niceDate":"2天前","niceShareDate":"15小时前","origin":"","prefix":"","projectLink":"","publishTime":1622217600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1622384896000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"ConstraintLayout2.0一篇写不完之MotionEffect","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18458,"link":"https://juejin.cn/post/6844904094503550984/","niceDate":"2021-05-28 09:24","niceShareDate":"2021-05-28 09:24","origin":"","prefix":"","projectLink":"","publishTime":1622165073000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622165073000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"HTTPS及加密算法，看这一篇就够了 ","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18454,"link":"https://juejin.cn/post/6967039557220958244","niceDate":"2021-05-28 02:46","niceShareDate":"2021-05-28 02:46","origin":"","prefix":"","projectLink":"","publishTime":1622141161000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622141161000,"shareUser":"彭旭锐","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android | Jetpack 处理回退事件的新姿势 &mdash;&mdash; OnBackPressedDispatcher","type":0,"userId":30587,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":423,"chapterName":"Architecture","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18450,"link":"https://www.jianshu.com/p/94108191eac3","niceDate":"2021-05-28 00:29","niceShareDate":"2021-05-27 20:30","origin":"","prefix":"","projectLink":"","publishTime":1622132982000,"realSuperChapterId":422,"selfVisible":0,"shareDate":1622118656000,"shareUser":"深红骑士","superChapterId":423,"superChapterName":"Jetpack","tags":[],"title":"深度解读 Jetpack 框架的基石 - AppCompat","type":0,"userId":29303,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>之前看文章，经常看到一些分析 Dialog、PopupWindow的文章，有些文章分析如下：<\/p>\r\n<p><strong>Dialog有自己独立的Window，而PopupWindow没有，所以PopupWindow可以称之为子窗口，而 Dialog不是。<\/strong><\/p>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>这种说法合理吗？<\/li>\r\n<li>在Android中，有没有子窗口的概念呢？如果有到底应该以什么为标准呢？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18192,"link":"https://wanandroid.com/wenda/show/18192","niceDate":"2021-05-28 00:29","niceShareDate":"2021-05-06 00:15","origin":"","prefix":"","projectLink":"","publishTime":1622132956000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1620231346000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Android中的子窗口到底指的是什么？","type":0,"userId":2,"visible":1,"zan":10},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>对于 Intent 大家肯定都不陌生，今天我们聊一聊它的一个近亲：<strong>PendingIntent<\/strong><\/p>\r\n<p>官方对其描述为：<\/p>\r\n<p>A description of an Intent and target action to perform with it. <\/p>\r\n<p>那么问题来了：<\/p>\r\n<ol>\r\n<li>PendingIntent 仅仅是对 Intent 的一个封装吗？<\/li>\r\n<li>如果1 不是，那么为什么 PendingIntent与 Intent 有何不同，它的定位是什么样的呢？<\/li>\r\n<li>对于 2 的回答，如果从源码侧佐证？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18072,"link":"https://www.wanandroid.com/wenda/show/18072","niceDate":"2021-05-28 00:29","niceShareDate":"2021-04-24 22:58","origin":"","prefix":"","projectLink":"","publishTime":1622132946000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1619276317000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 已经有了 Intent，那为啥还要 PendingIntent?","type":0,"userId":2,"visible":1,"zan":7},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18449,"link":"https://juejin.cn/post/6966858553583730718","niceDate":"2021-05-27 15:26","niceShareDate":"2021-05-27 15:26","origin":"","prefix":"","projectLink":"","publishTime":1622100405000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622100405000,"shareUser":"sweetying","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"&quot;一篇就够&quot;系列：Android Emoji 表情分享和实践","type":0,"userId":5405,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18448,"link":"https://juejin.cn/post/6966807721878224933/","niceDate":"2021-05-27 11:35","niceShareDate":"2021-05-27 11:35","origin":"","prefix":"","projectLink":"","publishTime":1622086523000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622086523000,"shareUser":"xll","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"LeetCode刷题笔记1366通过投票对团队排名","type":0,"userId":22903,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18447,"link":"https://juejin.cn/post/6844904082583322632","niceDate":"2021-05-27 10:54","niceShareDate":"2021-05-27 10:54","origin":"","prefix":"","projectLink":"","publishTime":1622084056000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622084056000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"时间复杂度和空间复杂度","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18445,"link":"https://mp.weixin.qq.com/s/MhHTKwywee_GQBOKqZv3Eg","niceDate":"2021-05-27 09:35","niceShareDate":"2021-05-27 09:35","origin":"","prefix":"","projectLink":"","publishTime":1622079310000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622079310000,"shareUser":"程序员徐公","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"View 事件分发机制，看这一篇就够了","type":0,"userId":5339,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18451,"link":"https://mp.weixin.qq.com/s/7vWg3epsXIH3hFeohkNUag","niceDate":"2021-05-27 00:00","niceShareDate":"2021-05-27 22:23","origin":"","prefix":"","projectLink":"","publishTime":1622044800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1622125420000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android 事件分发中你可能忽略掉的点！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18452,"link":"https://mp.weixin.qq.com/s/NEKiAPZnJjgwBHU5o-WS0g","niceDate":"2021-05-27 00:00","niceShareDate":"2021-05-27 22:23","origin":"","prefix":"","projectLink":"","publishTime":1622044800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1622125435000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"从AGP构建过程到APK打包过程","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":169,"chapterName":"gradle","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18438,"link":"https://juejin.cn/post/6966526844552085512","niceDate":"2021-05-26 21:35","niceShareDate":"2021-05-26 21:33","origin":"","prefix":"","projectLink":"","publishTime":1622036133000,"realSuperChapterId":150,"selfVisible":0,"shareDate":1622035986000,"shareUser":"鸿洋","superChapterId":60,"superChapterName":"开发环境","tags":[],"title":"补齐Android技能树 - 从害怕到玩转Android代码混淆","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":198,"chapterName":"基础概念","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18439,"link":"https://juejin.cn/post/6966223613057826852","niceDate":"2021-05-26 21:34","niceShareDate":"2021-05-26 21:33","origin":"","prefix":"","projectLink":"","publishTime":1622036069000,"realSuperChapterId":167,"selfVisible":0,"shareDate":1622036037000,"shareUser":"鸿洋","superChapterId":168,"superChapterName":"基础知识","tags":[],"title":"聊聊 Context 的一些知识点","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18436,"link":"https://juejin.cn/post/6966508665633243172/","niceDate":"2021-05-26 16:13","niceShareDate":"2021-05-26 16:13","origin":"","prefix":"","projectLink":"","publishTime":1622016814000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1622016814000,"shareUser":"飞一般的感觉","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"【Gradle学习指南】Groovy基本语法","type":0,"userId":34408,"visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 528
         * size : 20
         * total : 10553
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * apkLink :
             * audit : 1
             * author :
             * canEdit : false
             * chapterId : 502
             * chapterName : 自助
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : true
             * host :
             * id : 18473
             * link : https://blog.csdn.net/willway_wang/article/details/117245071?spm=1001.2014.3001.5501
             * niceDate : 41分钟前
             * niceShareDate : 41分钟前
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1622439468000
             * realSuperChapterId : 493
             * selfVisible : 0
             * shareDate : 1622439468000
             * shareUser : willwaywang6
             * superChapterId : 494
             * superChapterName : 广场Tab
             * tags : []
             * title : Android筑基&mdash;&mdash;Gson 框架学习笔记
             * type : 0
             * userId : 833
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private boolean canEdit;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String descMd;
            private String envelopePic;
            private boolean fresh;
            private String host;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int realSuperChapterId;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<?> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDescMd() {
                return descMd;
            }

            public void setDescMd(String descMd) {
                this.descMd = descMd;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public String getHost() {
                return host;
            }

            public void setHost(String host) {
                this.host = host;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getRealSuperChapterId() {
                return realSuperChapterId;
            }

            public void setRealSuperChapterId(int realSuperChapterId) {
                this.realSuperChapterId = realSuperChapterId;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }
        }
    }
}