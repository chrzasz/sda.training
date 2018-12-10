package sda.training.linkedListHash;

import sda.training.linkedListHash.Patient;

import java.util.*;
import java.util.stream.Collectors;

public class OurOwnHashMap implements Map<String, Patient> {

    private ArrayList<ArrayList<Patient>> patients;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        // we need this
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        // we need this
        return false;
    }

    @Override
    public Patient get(Object key) {
        // we need this
        return null;
    }

    private int hash(String s) {
        // code hash here
        return 0;
    }

    @Override
    public Patient put(String key, Patient value) {
        //we need this
        return null;
    }

    @Override
    public Patient remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends String, ? extends Patient> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<String> keySet() {
        return null;
    }

    @Override
    public Collection<Patient> values() {
        return null;
    }

    @Override
    public Set<Entry<String, Patient>> entrySet() {
        return null;
    }
}
