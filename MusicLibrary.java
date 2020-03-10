public class MusicLibrary {
    private Album[] library;


    public MusicLibrary() {
        library = new Album[10];
    }

    //Looks for spot that's null, adds album there then returns true. If no null spots, don't add, return false
    public boolean add(Album inp) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] == null) {
                library[i] = inp;
                return true;
            }
        }
        return false;
    }


    public boolean remove(int index) {
        if (index >= 0 && index < library.length && library[index] != null) {
            library[index] = null;
            return true;
        }
        return false;
    }

    public String toString() {
        String result = "";
        for (Album a : library) {
            if (a != null) {
                result += a.toString() + "\n";
            } else {
                result += "EMPTY\n";
            }
        }
        return result;
    }

    public int findTitle(String title) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] != null && library[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public int findArtist(String artist) {

    }

    public Album getAlbum(int index) {
        if (index >= 0 && index <= library.length) {
            return library[index];
        } else {
            System.out.println("Index out of bounds");
            return null;
        }
    }

    public linearTitleSearch(String title) {
        for (int i = 0; i < library.length; i++) {
            if (library[i.getTitle].equals(tile)) {
                return i;
            }
            return -1;
        }

    }

    public linearArtistSearch(String title) {
        for (int i = 0; i < library.length; i++) {
            if (library[i.getArtist].equals(tile)) {
                return i;
            }
            return -1;
        }

    }

    public void titleSelectionSort(int[] library) {
        int min, temp;

        for (int i = 0; i < library.length - 1; i++) {
            min = i.getTitle;
            for (int scan = i + 1; scan < library.length; scan++) {
                if (library[scan] < library[min])
                    min = scan;
            }

            temp = library[min];
            library[min] = library[i.getTitle];
            library[i.getTitle] = temp;
        }
    }

    public void artistSelectionSort(int[] library) {
        int min, temp;

        for (int i = 0; i < library.length - 1; i++) {
            min = i.getArtist;
            for (int scan = i + 1; scan < library.length; scan++) {
                if (library[scan] < library[min])
                    min = scan;
            }

            temp = library[min];
            library[min] = library[i.getArtist];
            library[i.getArtist] = temp;
        }
    }

    public int titleBinarySearch(String[] library) {
        int low = 0, high = library.length - 1, middle = (low + high) / 2;

        while (library[middle] != album.title && low <= high) {
            if (album.title < library[middle])
                high = middle - 1;
            else
                low = middle + 1;
            middle = (low + high) / 2;
        }

        if (library[middle] == album.title)
            return middle;
        else
            return -1;
    }

}
