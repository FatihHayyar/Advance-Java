package enumType;

public class MainTest {
    public static void main(String[] args) {
useCostanstMetot(5);//olmayan degeri verince hata vermiyor
useEnumMEtot(TransactionType.depozit);
useEnumMEtot(TransactionType.transfer);
//useEnumMEtot(a); olmayan degeri yazdirmaz. sadece kendi istediklerinden sectirir

    }
private static void useCostanstMetot(int i){
        if(i==TransactionTypeConstant.depozito){
            System.out.println("Deozit");
        }else if(i==TransactionTypeConstant.payment){
            System.out.println("payment");
        }else if(i==TransactionTypeConstant.transfer){
            System.out.println("transfer");}
        else if(i==TransactionTypeConstant.witdraw){
            System.out.println("withdraw");}
        else if(i==TransactionTypeConstant.other){
            System.out.println("other");}
}
private static void useEnumMEtot(TransactionType i){
        if(i==TransactionType.depozit){
            System.out.println("depozit");
        }else  if(i==TransactionType.payment){
            System.out.println("payment");}
        else  if(i==TransactionType.transfer){
            System.out.println("transfer");}
        else  if(i==TransactionType.withdraw){
            System.out.println("witdraw");}
        else  if(i==TransactionType.other){
            System.out.println("other");}

    //Enum yapiya has metotlar
    System.out.println("enum name = "+i.name());
    System.out.println("Enum kod value = "+i.getTransactionCode());
    System.out.println("Enum sirasi = "+i.ordinal());

}

}
