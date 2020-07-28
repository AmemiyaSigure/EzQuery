package cx.rain.ezquery.api.queryable;

import java.util.Collection;
import java.util.function.Predicate;

public interface IQueryable<T extends Collection<T>> {
    // Todo
    IQueryable<T> where(Predicate<? extends T> condition);

    int count();
}
