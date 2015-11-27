package suryagaddipati.codeclimate;

/*
{"type":"Issue","check_name":"Rubocop/Style/SpaceBeforeComma","description":"Space found before comma.",
"categories":["Style"],"remediation_points":50000,
"location":{"path":"lib/cc/engine/csslint.rb",
"positions":{"begin":{"column":38,"line":7},"end":{"column":39,"line":7}}},
"content":{"body":"Checks for comma (,) preceded by space."},"engine_name":"rubocop"}
 */
public class CodeClimateWarning {
    public String type;
    public String check_name;
    public String description;
    public String[] categories;
    public int remediation_points;
    public  Location location;
    public Content content;
    public String engine_name;

    public static class Content{
       public String body;
    }

    public static class Location{
        public String path;
        public Position positions;



        public static class Position{
            public ColLine begin;
            public ColLine end;
            public static class ColLine{
                public int column;
                public int line;
            }

        }
    }

}
