import java.util.List;
import java.util.ArrayList;
public class Assignment3 {
    public static void main(String args[])
    {
        System.out.println("Today's Special Menu");
        System.out.println("---------------------");
        System.out.println("Special Cakes");
        List<cake1> ck=new ArrayList();
        cake1 c= new cake1();
        c.setName("Chocolate Brownie");
        c.getName();
        c.setPrice(35);
        c.getPrice();

        cake1 c1=new cake1();
        c1.setName("Chocolate Mapple");
        c1.getName();
        c1.setPrice(40);
        c1.getPrice();
        ck.add(c);
        ck.add(c1);

        List<Pastry1> pk=new ArrayList();
        Pastry1 p= new Pastry1();
        p.setName("BlackForest");
        p.getName();
        p.setPrice(35);
        p.getPrice();

        Pastry1 p1=new Pastry1();
        p1.setName("Choco Truffle");
        p1.getName();
        p1.setPrice(40);
        p1.getPrice();
        pk.add(p);
        pk.add(p1);

        for(cake1 ca:ck)
        {
            ca.display();
            // c1.display();
        }
        System.out.println("Special Pastry");
        System.out.println("----------------");
        for(Pastry1 past:pk)
        {
            past.display();
            //  p1.display();
        }

    }
}
class cake1  {
    String name;
    float price;
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setPrice(float price)
    {
        this.price=price;
    }
    public float getPrice()
    {
        return price;
    }
    public void display()
    {
        System.out.println(name+" : "+"\u20B9"+price+"per pound");
    }

}
class Pastry1 extends cake1{
    @Override
    public void display()
    {
        System.out.println(name+" : "+"\u20B9"+price+"per piece");
    }

}


