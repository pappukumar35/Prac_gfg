
class Solution {
    int binarysearch(int arr[], int n, int k) {
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                ans=i;
                break;
            }
        }
        return ans;
    }
}