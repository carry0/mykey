package com.example.workday.base;

import java.util.List;

public class PagerBase {

    /**
     * showapi_res_error :
     * showapi_res_id : 2b0a15a3d0b24e86b94c97e57fd527bd
     * showapi_res_code : 0
     * showapi_res_body : {"list":[{"name":"新闻","id":562},{"name":"曝光","id":563},{"name":"保健","id":570},{"name":"养生","id":569},{"name":"心理","id":568},{"name":"常见病","id":578},{"name":"疑难病","id":579},{"name":"用药","id":580},{"name":"产经","id":565},{"name":"两性","id":663},{"name":"专栏","id":664},{"name":"挑食","id":567},{"name":"图集","id":752}],"ret_code":0}
     */

    private String showapi_res_error;
    private String showapi_res_id;
    private int showapi_res_code;
    private ShowapiResBodyBean showapi_res_body;

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public String getShowapi_res_id() {
        return showapi_res_id;
    }

    public void setShowapi_res_id(String showapi_res_id) {
        this.showapi_res_id = showapi_res_id;
    }

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        /**
         * list : [{"name":"新闻","id":562},{"name":"曝光","id":563},{"name":"保健","id":570},{"name":"养生","id":569},{"name":"心理","id":568},{"name":"常见病","id":578},{"name":"疑难病","id":579},{"name":"用药","id":580},{"name":"产经","id":565},{"name":"两性","id":663},{"name":"专栏","id":664},{"name":"挑食","id":567},{"name":"图集","id":752}]
         * ret_code : 0
         */

        private int ret_code;
        private List<ListBean> list;

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * name : 新闻
             * id : 562
             */

            private String name;
            private int id;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
    }
}
