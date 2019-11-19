package prototypes.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //given
        //when
        Library library = new Library("library 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(6)
                .forEach(n -> library.getBooks().add(new Book("Book " + n, "Author " + n, LocalDate.of(1992, 10, 1))));

        //shallow copy
        Library shallowClone = null;
        try {
            shallowClone = library.shallowCopy();
            shallowClone.setName("library shallow clone");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //deep copy
        Library deepClone = null;
        try {
            deepClone = library.deepCopy();
            deepClone.setName("library deep clone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //then
        System.out.println(library);
        System.out.println(shallowClone);
        System.out.println(deepClone);
        Assert.assertEquals(6, library.getBooks().size());
        Assert.assertEquals(6, shallowClone.getBooks().size());
        Assert.assertEquals(6, deepClone.getBooks().size());
    }
}
