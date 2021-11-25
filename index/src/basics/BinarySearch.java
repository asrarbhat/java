public class BinarySearch {
    public static void main(String[] args) {
        int[] array={1,2,4,7,8,99,888};
        int index=binarySearch(array,999);
        System.out.println(index);
    }
    public static int binarySearch(int[] array,int key){
        int index;
        int mid=array.length/2;
        if (array[mid]==key)return mid;
        else if(array.length==1)return -mid-1;
        else if (array[mid]>key){
            int[] arr=new int[mid];
            for(int i=0;i<mid;i++) arr[i]=array[i];
                index=binarySearch(arr,key);
                if (index>=0)return index;
        }
        else{
            int[] arr=new int[array.length-mid-1];
            for(int i=0;i<arr.length;i++) arr[i]=array[mid+i+1];
                 index=binarySearch(arr,key);
            if (index>=0)return mid+index+1;
        }
        return -index-1;
    }
}
