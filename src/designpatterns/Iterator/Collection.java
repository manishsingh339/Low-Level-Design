package designpatterns.Iterator;

class NameIterator implements Iterator {
    private String[] names;
    private int index;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return names[index++];
        }
        return null;
    }
}

class NameCollection implements IterableCollection {
    private String[] names = {"John", "Jane", "Jack"};

    @Override
    public Iterator getIterator() {
        return new NameIterator(names);
    }
}
