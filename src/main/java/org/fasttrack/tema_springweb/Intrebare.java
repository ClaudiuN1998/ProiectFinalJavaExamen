package org.fasttrack.tema_springweb;




public class Intrebare {


        private long id;
        private String enunt;
        private String[] optiuni;
        private int raspunsCorect;

        public Intrebare(long id, String enunt, String[] optiuni, int raspunsCorect) {
            this.id = id;
            this.enunt = enunt;
            this.optiuni = optiuni;
            this.raspunsCorect = raspunsCorect;
        }

    public long getId() {

            return id;
    }


    public String getEnunt() {

            return enunt;
        }

        public String[] getOptiuni() {

            return optiuni;
        }

        public int getRaspunsCorect() {

            return raspunsCorect;
        }
    }


