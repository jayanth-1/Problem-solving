
//Question link

/*https://www.hackerrank.com/challenges/designer-pdf-viewer/problem*/

// Complete the designerPdfViewer function below.

    static int designerPdfViewer(int[] h, String word) {
            
        int n = word.length();
        int tall = 0;
        for(int i=0; i<n; i++){
            int l = h[word.charAt(i)-'a'];
             tall = Math.max(l,tall);
        }
       
        int area = tall*word.length();
        
        return area;
    }
