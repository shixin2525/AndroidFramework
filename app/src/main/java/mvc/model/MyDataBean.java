package mvc.model;


import android.databinding.BaseObservable;

public class MyDataBean extends BaseObservable{

    /**
     * data : {"date":{"curr":"20180611","prev":"20180610","next":"20180612"},"author":"张小娴","title":"朋友的距离","digest":"最好的朋友，也许不在身边，而在远方。他跟你，相隔十万八千里，身处不同的国家，各有各的生活，然而，你却会把最私密的事告诉他。把心事告诉他，那是","content":"<p>最好的朋友，也许不在身边，而在远方。<\/p><p>他跟你，相隔十万八千里，身处不同的国家，各有各的生活，然而，你却会把最私密的事告诉他。<\/p><p>把心事告诉他，那是最安全的。因为，他也许从未见过你在信上所说的那些人，他绝对不会有一天闯进你的圈子。最重要的，是他远在他方，他即使知道得最多，仍然是最安全的。<\/p><p>许多年前，一个比我高一班的女孩子到美国求学，我们本来只是很普通的朋友，她到了美国之后，也许寂寞吧，常给我写信，向来懒得写信的我，因为感动，也常写信给她。在信中，我们可以坦荡荡的把最私密的事告诉对方，寻求对方的意见，我们甚至毋须在信上叮嘱对方，不要把这些事告诉任何人，她深深知道，我不会把她的事告诉我身边的人，她也不会。那些信任，是我们共享的秘密，我成为她最好的朋友。<\/p><p>在她留学的那三年里，我们只是通信而没有见面。然而，当她从美国回来，我们的友情却是三年前无法比拟的，仿佛是最好的故人重逢。<\/p><p>原来，最好的朋友，还是应该有距离。那段在地球上的遥远距离，正好把你们的距离拉近。<\/p>","wc":423}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "date=" + date +
                    ", author='" + author + '\'' +
                    ", title='" + title + '\'' +
                    ", digest='" + digest + '\'' +
                    ", content='" + content + '\'' +
                    ", wc=" + wc +
                    '}';
        }

        /**
         * date : {"curr":"20180611","prev":"20180610","next":"20180612"}
         * author : 张小娴
         * title : 朋友的距离
         * digest : 最好的朋友，也许不在身边，而在远方。他跟你，相隔十万八千里，身处不同的国家，各有各的生活，然而，你却会把最私密的事告诉他。把心事告诉他，那是
         * content : <p>最好的朋友，也许不在身边，而在远方。</p><p>他跟你，相隔十万八千里，身处不同的国家，各有各的生活，然而，你却会把最私密的事告诉他。</p><p>把心事告诉他，那是最安全的。因为，他也许从未见过你在信上所说的那些人，他绝对不会有一天闯进你的圈子。最重要的，是他远在他方，他即使知道得最多，仍然是最安全的。</p><p>许多年前，一个比我高一班的女孩子到美国求学，我们本来只是很普通的朋友，她到了美国之后，也许寂寞吧，常给我写信，向来懒得写信的我，因为感动，也常写信给她。在信中，我们可以坦荡荡的把最私密的事告诉对方，寻求对方的意见，我们甚至毋须在信上叮嘱对方，不要把这些事告诉任何人，她深深知道，我不会把她的事告诉我身边的人，她也不会。那些信任，是我们共享的秘密，我成为她最好的朋友。</p><p>在她留学的那三年里，我们只是通信而没有见面。然而，当她从美国回来，我们的友情却是三年前无法比拟的，仿佛是最好的故人重逢。</p><p>原来，最好的朋友，还是应该有距离。那段在地球上的遥远距离，正好把你们的距离拉近。</p>
         * wc : 423
         */

        private DateBean date;
        private String author;
        private String title;
        private String digest;
        private String content;
        private int wc;

        public DateBean getDate() {
            return date;
        }

        public void setDate(DateBean date) {
            this.date = date;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDigest() {
            return digest;
        }

        public void setDigest(String digest) {
            this.digest = digest;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getWc() {
            return wc;
        }

        public void setWc(int wc) {
            this.wc = wc;
        }

        public static class DateBean {
            /**
             * curr : 20180611
             * prev : 20180610
             * next : 20180612
             */

            private String curr;
            private String prev;
            private String next;

            public String getCurr() {
                return curr;
            }

            public void setCurr(String curr) {
                this.curr = curr;
            }

            public String getPrev() {
                return prev;
            }

            public void setPrev(String prev) {
                this.prev = prev;
            }

            public String getNext() {
                return next;
            }

            public void setNext(String next) {
                this.next = next;
            }
        }
    }

    @Override
    public String toString() {
        return "MyDataBean{" +
                "data=" + data +
                '}';
    }
}
