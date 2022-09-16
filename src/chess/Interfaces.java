package chess;

public interface Interfaces {
    public enum Color {
        BLACK {
            public String toString(){
                return "BLACK";
            }
        },
        WHITE {
            public String toString(){
                return "WHITE";
            }
        }
    }

    public enum Directories {
        PATH {
            public String toString() {
                return "../princeton/images/";
            }
            public String GET() {
                return this.toString();
            }
        },
        BLACK_QUEEN {
            public String toString(){
                return PATH + "Dn.png";
            }
            public String GET() {
                return this.toString();
            }
        },
        WHITE_QUEEN {
            public String toString() {
                return PATH + "Db.png";
            }
            public String GET() {
                return this.toString();
            }
        },
        WHITE_KNIGHT {
            public String toString() {
                return PATH + "Cb.png";
            }
            public String GET() {
                return this.toString();
            }
        },
        BLACK_KNIGHT {
            public String toString() {
                return PATH + "Cn.png";
            }
            public String GET() {
                return this.toString();
            }
        },
        BLACK_BISHOP {
            public String toString() {
                return PATH + "Fn.png";
            }
            public String GET() {
                return this.toString();
            }
        },
        WHITE_BISHOP {
            public String toString() {
                return PATH + "Fb.png";
            }
            public String GET() {
                return this.toString();
            }
        },
        WHITE_PAWN {
            public String toString() {
                return PATH + "Pb.png";
            }
            public String GET() {
                return this.toString();
            }
        },
        BLACK_PAWN {
            public String toString() {
                return PATH + "Pn.png";
            }
            public String GET() {
                return this.toString();
            }
        },
        WHITE_KING {
            public String toString() {
                return PATH + "Rb.png";
            }
            public String GET() {
                return this.toString();
            }
        },
        BLACK_KING {
            public String toString() {
                return PATH + "Rn.png";
            }
            public String GET() {
                return this.toString();
            }
        },
        WHITE_ROOK {
            public String toString() {
                return PATH + "Tb.png";
            }
            public String GET() {
                return this.toString();
            }
        },
        BLACK_ROOK {
            public String toString() {
                return PATH + "Tn.png";
            }
            public String GET() {
                return this.toString();
            }
        };
        private String PIECE_DIRECTORY;

        public static String GETIT(){
            return null;
        }
    }
}
