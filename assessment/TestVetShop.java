package assessment;

public class TestVetShop {
    public static void main(String[] args) {

        Owner owner1 = new Owner("Timmy Clifford","72 Spa Rd., Tralee, Co Kerry","085-2891234");
        Owner owner2 = new Owner("Mary O Connor","32 Park Rd., Killarney, Co Kerry","083-1231256");

        Pet pet1 = new Pet("Fido","Dog","10-01-2020","16-08-2019", owner1);
        Pet pet2 = new Pet("Rascal","Cat","21-03-2017","01-03-2016", owner2);
        Pet pet3 = new Pet("Sammy","Snake","02-11-2022","14-05-2022", owner2);

        Pet[] allPets = new Pet[3];
        allPets[0] = pet1;
        allPets[1] = pet2;
        allPets[2] = pet3;

        VetShop vetShop1 = new VetShop( "McGrath's Vet Centre","Rock St., Tralee, Co. Kerry", "087-5342571");

        //System.out.println(pet1 + "\n" + pet2 + "\n" + pet3);
        System.out.println("Initial state of the vet shop: \n\n"+vetShop1);
    }
}
