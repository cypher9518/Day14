package com.assinment;
    public class HTable <K, V> {
        MapNode head;
        MapNode tail;

        public void add(K key, V value) {
            MapNode<K, V> myNode = (MapNode<K, V>) searchNode(key);
            if(myNode == null) {
                myNode = new MapNode<>(key , value);
                this.append(myNode);
            }
            else {
                myNode.setValue(value);
            }
        }

        public void append(MapNode<K, V> myNode) {
            if(this.head == null)
                this.head = myNode;
            if(this.tail == null)
                this.tail = myNode;
            else {
                this.tail.setNext(myNode);
                this.tail = myNode;
            }
        }

        public MapNode<K, V> searchNode(K data) {
            MapNode currentNode = head;
            int position = 0;
            while (currentNode != null) {
                position++;
                if (currentNode.getKey().equals(data)) {
                    return currentNode;
                }
                currentNode = currentNode.getNext();
            }
            return currentNode;
        }

        public V get(K word) {
            MapNode<K, V> MapNode = searchNode(word);
            return (MapNode == null) ? null : MapNode.getValue();
        }

        public void remove(K word) {
            MapNode currentNode = head;
            MapNode previousNode = null;
            while (currentNode != null && currentNode.getKey().equals(word)) {
                head = currentNode.getNext();
                return;
            }
            while (currentNode != null && !(currentNode.getKey().equals(word))) {
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if (currentNode != null) {
                previousNode.next = currentNode.next;
            }
            if(currentNode == null)
                System.out.println("Word not found!");
        }

        @Override
        public String toString() {
            return "Linked List Nodes { " + head + " }";
        }

        public void printNodes() {
            System.out.println("My nodes: " + head);
        }
    }
