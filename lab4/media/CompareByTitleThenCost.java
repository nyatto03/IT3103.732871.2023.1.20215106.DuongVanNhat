// package media;

// public class CompareByTitleThenCost implements Comparator<Media> {

//     @Override
//     public int compare(Media m1, Media m2) {
//         // Compare title
//         int titleCompare = m1.getTitle().compareTo(m2.getTitle());

//         if (titleCompare != 0) {
//             return titleCompare;
//         }

//         // Compare cost if title is equal
//         return Double.compare(m1.getCost(), m2.getCost());
//     }

// }