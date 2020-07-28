package cx.rain.ezquery.queryable;

import cx.rain.ezquery.api.queryable.IQueryable;

import java.util.Collection;
import java.util.function.Predicate;

public class QueryableList<T extends Collection<T>> implements IQueryable<T> {
    private final Collection<T> internalCollection;

    public QueryableList(Collection<T> collection) {
        internalCollection = collection;
    }

    @Override
    public IQueryable<T> where(Predicate<? extends T> condition) {


        return new QueryableList<T>();
    }

    @Override
    public int count() {
        return 0;
    }
}
