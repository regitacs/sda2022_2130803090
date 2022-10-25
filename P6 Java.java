class link{
    public int idata;
    public double ddata;
    public link next;

    public link(int id,double dd)
    {
        idata=id;
        ddata=dd;
    }
    public void displaylink()
    {
        System.out.print("{"+idata+","+ddata+"}");
    }
}
//////////////////////////////////////////////////////////////////
class linklist
{
    private link first;

public linklist()
{
    first=null;
}
public boolean isempty()
{
    return(first==null);
}
public void insertfirst (int id,double dd)
{
    link newlink = new link (id, dd);
    newlink.next=first;
    first = newlink;
}
public link deleterfirst()
{
    link temp =first;
    first=first.next;
    return temp;
}
public void displaylist()
{
    System.out.print("list (first--->last): ");
    link current =first;
    while(current !=null)
    {
        current.displaylink();
        current=current.next;
    }
    System.out.println("");
}
}
////////////////////////////////////////////////////////

class linklistapp{
    public static void main(String[] args) {

        linklist thelist = new linklist();

        thelist.insertfirst(22, 2.99);
        thelist.insertfirst(44, 4.99);
        thelist.insertfirst(66, 6.99);
        thelist.insertfirst(88, 8.99);

        thelist.displaylist();

        while ( !thelist.isempty() )
        {
            link alink=thelist.deleterfirst();
            System.out.print("deleted");
            alink.displaylink();
            System.out.println("");
        }
    thelist.displaylist();

    }