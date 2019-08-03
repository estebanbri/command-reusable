package com.example.commandreusable.pattern;

import com.example.commandreusable.pattern.util.Container;

import java.util.*;

public class ActionList implements Action, List<Action> {

    List<Action> actionList;

    ActionList(){
        actionList = new LinkedList();
    }

    public ActionList(Collection<Action> actionList) {
        this.actionList = new LinkedList<Action>(actionList);
    }

    @Override
    public boolean add(Action action) {
        return actionList.add(action);
    }

    @Override
    public void execute(Container container) {
        System.out.println("***  EJECUTANDO: ActionList");
        for(Action action: actionList){
            action.execute(container);
        }
    }

    @Override
    public int size() {
        return actionList.size();
    }

    @Override
    public boolean isEmpty() {
        return actionList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return actionList.contains((Action)o);
    }

    @Override
    public Iterator<Action> iterator() {
        return actionList.iterator();
    }

    @Override
    public Object[] toArray() {
        return actionList.toArray();
    }

    @Override
    public boolean remove(Object o) {
        return actionList.remove((Action)o);
    }

    // falta

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Action get(int index) {
        return null;
    }

    @Override
    public Action set(int index, Action element) {
        return null;
    }

    @Override
    public void add(int index, Action element) {

    }


    @Override
    public Action remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Action> listIterator() {
        return actionList.listIterator();
    }

    @Override
    public ListIterator<Action> listIterator(int index) {
        return actionList.listIterator(index);
    }

    @Override
    public List<Action> subList(int fromIndex, int toIndex) {
        return actionList.subList(fromIndex, toIndex);
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
