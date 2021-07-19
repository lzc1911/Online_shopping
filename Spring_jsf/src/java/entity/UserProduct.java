package entity;
// Generated 2020-12-6 13:43:02 by Hibernate Tools 4.3.1

import static entity.UserAdm.useradm;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import service.DataCRUDImp;




/**
 * UserProduct generated by hbm2java
 */
@ManagedBean
@RequestScoped
public class UserProduct  implements java.io.Serializable {


     private String PIdent;
     private String id;
     private String PName;
     private Double PPrice;
     private Integer PQuantity;
     private double Pri;
     private List<UserProduct> list1 =null;
     public String addCommit1() {
        DataCRUDImp s = new DataCRUDImp();
        Product Q = s.selectIdent("1");
        if(Q.getPQuantity()<this.PQuantity)
            return "Erro";
        else
        { 
            int Q1 = Q.getPQuantity() - this.PQuantity;
            s.modifyPro1(Q1);
            double P1 = Q.getPPrice()*this.PQuantity;
            UserProduct c = s.adduserPro1(useradm.getId(),this.PQuantity,P1);
            return "chenggong";
        }
    }
     public String addCommit2() {
        DataCRUDImp s = new DataCRUDImp();
        Product Q = s.selectIdent("2");
        if(Q.getPQuantity()<this.PQuantity)
            return "Erro";
        else
        { 
            int Q1 = Q.getPQuantity() - this.PQuantity;
            s.modifyPro2(Q1);
            double P1 = Q.getPPrice()*this.PQuantity;
            UserProduct c = s.adduserPro2(useradm.getId(),this.PQuantity,P1);
            return "chenggong";
        }
    }
     public String addCommit3() {
        DataCRUDImp s = new DataCRUDImp();
        Product Q = s.selectIdent("3");
        if(Q.getPQuantity()<this.PQuantity)
            return "Erro";
        else
        { 
            int Q1 = Q.getPQuantity() - this.PQuantity;
            s.modifyPro3(Q1);
            double P1 = Q.getPPrice()*this.PQuantity;
            UserProduct c = s.adduserPro3(useradm.getId(),this.PQuantity,P1);
            return "chenggong";
        }
    }
     public String addCommit4() {
        DataCRUDImp s = new DataCRUDImp();
        Product Q = s.selectIdent("4");
        if(Q.getPQuantity()<this.PQuantity)
            return "Erro";
        else
        { 
            int Q1 = Q.getPQuantity() - this.PQuantity;
            s.modifyPro4(Q1);
            double P1 = Q.getPPrice()*this.PQuantity;
            UserProduct c = s.adduserPro4(useradm.getId(),this.PQuantity,P1);
            return "chenggong";
        }
    }
     public String addCommit5() {
        DataCRUDImp s = new DataCRUDImp();
        Product Q = s.selectIdent("5");
        if(Q.getPQuantity()<this.PQuantity)
            return "Erro";
        else
        { 
            int Q1 = Q.getPQuantity() - this.PQuantity;
            s.modifyPro5(Q1);
            double P1 = Q.getPPrice()*this.PQuantity;
            UserProduct c = s.adduserPro5(useradm.getId(),this.PQuantity,P1);
            return "chenggong";
        }
    }
     public String addCommit6() {
        DataCRUDImp s = new DataCRUDImp();
        Product Q = s.selectIdent("6");
        if(Q.getPQuantity()<this.PQuantity)
            return "Erro";
        else
        { 
            int Q1 = Q.getPQuantity() - this.PQuantity;
            s.modifyPro6(Q1);
            double P1 = Q.getPPrice()*this.PQuantity;
            UserProduct c = s.adduserPro6(useradm.getId(),this.PQuantity,P1);
            return "chenggong";
        }
    }
     public String addCommit7() {
        DataCRUDImp s = new DataCRUDImp();
        Product Q = s.selectIdent("7");
        if(Q.getPQuantity()<this.PQuantity)
            return "Erro";
        else
        { 
            int Q1 = Q.getPQuantity() - this.PQuantity;
            s.modifyPro7(Q1);
            double P1 = Q.getPPrice()*this.PQuantity;
            UserProduct c = s.adduserPro7(useradm.getId(),this.PQuantity,P1);
            return "chenggong";
        }
    }
     public String addCommit8() {
        DataCRUDImp s = new DataCRUDImp();
        Product Q = s.selectIdent("8");
        if(Q.getPQuantity()<this.PQuantity)
            return "Erro";
        else
        { 
            int Q1 = Q.getPQuantity() - this.PQuantity;
            s.modifyPro8(Q1);
            double P1 = Q.getPPrice()*this.PQuantity;
            UserProduct c = s.adduserPro8(useradm.getId(),this.PQuantity,P1);
            return "chenggong";
        }
    }
    public String selectPro() {
        DataCRUDImp s = new DataCRUDImp();
        this.list1 = s.selectproduc(useradm.getId());
        this.Pri = 0.0;
        for(UserProduct s1:this.list1)
        {
            this.Pri+=s1.PPrice;
        }
        return "newjsf";
    }
    public UserProduct() {
    }

    public UserProduct(String PIdent) {
        this.PIdent = PIdent;
    }
    public UserProduct(String PIdent, String id, String PName, Double PPrice, Integer PQuantity) {
       this.PIdent = PIdent;
       this.id = id;
       this.PName = PName;
       this.PPrice = PPrice;
       this.PQuantity = PQuantity;
    }

    public double getPri() {
        return Pri;
    }

    public void setPri(double Pri) {
        this.Pri = Pri;
    }

    
    public List<UserProduct> getList1() {
        return list1;
    }

    public void setList1(List<UserProduct> list1) {
        this.list1 = list1;
    }

    
   
    public String getPIdent() {
        return this.PIdent;
    }
    
    public void setPIdent(String PIdent) {
        this.PIdent = PIdent;
    }
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getPName() {
        return this.PName;
    }
    
    public void setPName(String PName) {
        this.PName = PName;
    }
    public Double getPPrice() {
        return this.PPrice;
    }
    
    public void setPPrice(Double PPrice) {
        this.PPrice = PPrice;
    }
    public Integer getPQuantity() {
        return this.PQuantity;
    }
    
    public void setPQuantity(Integer PQuantity) {
        this.PQuantity = PQuantity;
    }




}

