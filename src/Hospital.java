import sun.reflect.generics.visitor.Visitor;

public class Hospital {


            Visitor [] visitors = new Visitor[15];
            public  void addVisitor(Visitor visitors){
                for(int i =0; i < this.visitors.length; i++){
                    if(this.visitors[i]==null);
                    this.visitors[i]= visitors;
                    break;

                }
            }

            public Visitor[] getVisitors(String Worker) {
                 visitors result =null;
                for(int i =0; i < this.visitors.length; i++){
                    if(visitorsWorker.equals(visitors[i].getWorker())){
                        result= visitors[i];
                        break;
                    }
                }
                return visitors;
            }
            @Override
            public String toString(){
                return "People{"+
            }
        }
