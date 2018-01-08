package com.martin.martinhttp;

import java.util.List;

/**
 *
 */

public class Movies  {


    /**
     * title : 正在上映的电影
     * total : 25
     * entries : [{"rating":"7.4","pubdate":"2018-01-05","title":"星球大战8：最后的绝地武士","wish":19595,"original_title":"Star Wars: The Last Jedi","collection":16414,"orignal_title":"Star Wars: The Last Jedi","stars":"40","images":{"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506694509.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506694509.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506694509.webp"},"id":"22265634"},{"rating":"6.1","pubdate":"2017-12-29","title":"前任3：再见前任","wish":15659,"original_title":"前任3：再见前任","collection":40804,"orignal_title":"前任3：再见前任","stars":"30","images":{"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508926717.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508926717.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508926717.webp"},"id":"26662193"},{"rating":"7.8","pubdate":"2017-12-15","title":"芳华","wish":55987,"original_title":"芳华","collection":266716,"orignal_title":"芳华","stars":"40","images":{"large":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2507227732.webp","small":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2507227732.webp","medium":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2507227732.webp"},"id":"26862829"},{"rating":"4.8","pubdate":"2017-12-29","title":"妖铃铃","wish":9642,"original_title":"妖铃铃","collection":25978,"orignal_title":"妖铃铃","stars":"25","images":{"large":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2506825662.webp","small":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2506825662.webp","medium":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2506825662.webp"},"id":"26966580"},{"rating":"7.0","pubdate":"2017-12-22","title":"妖猫传","wish":39818,"original_title":"妖猫传","collection":188491,"orignal_title":"妖猫传","stars":"35","images":{"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507024497.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507024497.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507024497.webp"},"id":"5350027"},{"rating":"6.1","pubdate":"2017-12-29","title":"二代妖精之今生有幸","wish":7591,"original_title":"二代妖精之今生有幸","collection":26688,"orignal_title":"二代妖精之今生有幸","stars":"30","images":{"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507022339.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507022339.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2507022339.webp"},"id":"26797419"},{"rating":"9.1","pubdate":"2017-11-24","title":"寻梦环游记","wish":64646,"original_title":"Coco","collection":349458,"orignal_title":"Coco","stars":"45","images":{"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2503997609.webp"},"id":"20495023"},{"rating":"5.3","pubdate":"2017-12-29","title":"解忧杂货店","wish":15539,"original_title":"解忧杂货店","collection":30283,"orignal_title":"解忧杂货店","stars":"30","images":{"large":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2503544593.webp","small":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2503544593.webp","medium":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2503544593.webp"},"id":"26654146"},{"rating":"8.3","pubdate":"2017-12-08","title":"帕丁顿熊2","wish":29219,"original_title":"Paddington 2","collection":58295,"orignal_title":"Paddington 2","stars":"45","images":{"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506466229.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506466229.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506466229.webp"},"id":"26340419"},{"rating":"6.1","pubdate":"2017-12-22","title":"心理罪之城市之光","wish":16140,"original_title":"心理罪之城市之光","collection":34425,"orignal_title":"心理罪之城市之光","stars":"30","images":{"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506228506.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506228506.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506228506.webp"},"id":"26774722"},{"rating":"8.6","pubdate":"2017-12-08","title":"至爱梵高·星空之谜","wish":86816,"original_title":"Loving Vincent","collection":86516,"orignal_title":"Loving Vincent","stars":"45","images":{"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506935748.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506935748.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506935748.webp"},"id":"25837262"},{"rating":"","pubdate":"2017-12-30","title":"小猫巴克里","wish":333,"original_title":"小貓巴克里","collection":336,"orignal_title":"小貓巴克里","stars":"00","images":{"large":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2508948724.webp","small":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2508948724.webp","medium":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2508948724.webp"},"id":"26887161"},{"rating":"8.1","pubdate":"2018-01-05","title":"尼斯·疯狂的心","wish":4120,"original_title":"Nise - O Coração da Loucura","collection":714,"orignal_title":"Nise - O Coração da Loucura","stars":"40","images":{"large":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2277311434.webp","small":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2277311434.webp","medium":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2277311434.webp"},"id":"26631663"},{"rating":"5.0","pubdate":"2017-12-22","title":"机器之血","wish":5903,"original_title":"机器之血","collection":11233,"orignal_title":"机器之血","stars":"25","images":{"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2505785547.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2505785547.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2505785547.webp"},"id":"26729868"},{"rating":"","pubdate":"2017-12-30","title":"咕噜咕噜美人鱼2","wish":290,"original_title":"咕噜咕噜美人鱼2","collection":117,"orignal_title":"咕噜咕噜美人鱼2","stars":"00","images":{"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508071436.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508071436.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2508071436.webp"},"id":"27193475"},{"rating":"8.6","pubdate":"2017-12-01","title":"至暗时刻","wish":56626,"original_title":"Darkest Hour","collection":51891,"orignal_title":"Darkest Hour","stars":"45","images":{"large":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2504277551.webp","small":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2504277551.webp","medium":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2504277551.webp"},"id":"26761416"},{"rating":"4.8","pubdate":"2017-12-14","title":"奇门遁甲","wish":12402,"original_title":"奇门遁甲","collection":23721,"orignal_title":"奇门遁甲","stars":"25","images":{"large":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2507566212.webp","small":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2507566212.webp","medium":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2507566212.webp"},"id":"26661191"},{"rating":"","pubdate":"2017-12-21","title":"惊魂七夜","wish":73,"original_title":"惊魂七夜","collection":100,"orignal_title":"惊魂七夜","stars":"00","images":{"large":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2508243232.webp","small":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2508243232.webp","medium":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2508243232.webp"},"id":"26923563"},{"rating":"","pubdate":"2018-01-05","title":"只想好好和你在一起","wish":158,"original_title":"只想好好和你在一起","collection":9,"orignal_title":"只想好好和你在一起","stars":"00","images":{"large":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2508747042.webp","small":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2508747042.webp","medium":"http://img7.doubanio.com/view/photo/s_ratio_poster/public/p2508747042.webp"},"id":"27614421"},{"rating":"","pubdate":"2018-01-05","title":"我来过","wish":712,"original_title":"我来过","collection":21,"orignal_title":"我来过","stars":"00","images":{"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506261838.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506261838.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506261838.webp"},"id":"27199690"},{"rating":"","pubdate":"2017-12-01","title":"笔仙咒怨","wish":504,"original_title":"笔仙咒怨","collection":340,"orignal_title":"笔仙咒怨","stars":"00","images":{"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506139427.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506139427.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506139427.webp"},"id":"27054612"},{"rating":"","pubdate":"2017-12-08","title":"北平以北","wish":559,"original_title":"北平以北","collection":161,"orignal_title":"北平以北","stars":"00","images":{"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506935277.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506935277.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506935277.webp"},"id":"27180871"},{"rating":"","pubdate":"2017-10-14","title":"邹碧华","wish":91,"original_title":"邹碧华","collection":183,"orignal_title":"邹碧华","stars":"00","images":{"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506257419.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506257419.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506257419.webp"},"id":"26866174"},{"rating":"5.9","pubdate":"2017-12-08","title":"巨额来电","wish":4604,"original_title":"巨额来电","collection":4776,"orignal_title":"巨额来电","stars":"30","images":{"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2505456879.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2505456879.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2505456879.webp"},"id":"26985857"},{"rating":"8.4","pubdate":"2017-11-24","title":"嘉年华","wish":56458,"original_title":"嘉年华","collection":70679,"orignal_title":"嘉年华","stars":"45","images":{"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2503644828.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2503644828.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2503644828.webp"},"id":"27019527"}]
     */

    private String title;
    private int total;
    private List<EntriesBean> entries;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<EntriesBean> getEntries() {
        return entries;
    }

    public void setEntries(List<EntriesBean> entries) {
        this.entries = entries;
    }

    public static class EntriesBean {
        /**
         * rating : 7.4
         * pubdate : 2018-01-05
         * title : 星球大战8：最后的绝地武士
         * wish : 19595
         * original_title : Star Wars: The Last Jedi
         * collection : 16414
         * orignal_title : Star Wars: The Last Jedi
         * stars : 40
         * images : {"large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506694509.webp","small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506694509.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506694509.webp"}
         * id : 22265634
         */

        private String rating;
        private String pubdate;
        private String title;
        private int wish;
        private String original_title;
        private int collection;
        private String orignal_title;
        private String stars;
        private ImagesBean images;
        private String id;

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getPubdate() {
            return pubdate;
        }

        public void setPubdate(String pubdate) {
            this.pubdate = pubdate;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getWish() {
            return wish;
        }

        public void setWish(int wish) {
            this.wish = wish;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public int getCollection() {
            return collection;
        }

        public void setCollection(int collection) {
            this.collection = collection;
        }

        public String getOrignal_title() {
            return orignal_title;
        }

        public void setOrignal_title(String orignal_title) {
            this.orignal_title = orignal_title;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class ImagesBean {
            /**
             * large : http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506694509.webp
             * small : http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506694509.webp
             * medium : http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2506694509.webp
             */

            private String large;
            private String small;
            private String medium;

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }
}
