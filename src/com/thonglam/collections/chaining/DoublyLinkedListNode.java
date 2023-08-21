package com.thonglam.collections.chaining;// Java implementation of Hashtable chaining
// using doubly linked list

import java.util.*;

class DoublyLinkedListNode {
	// Declaration of Nodes
	DoublyLinkedListNode next, prev;
	int data;

	// constructor
	DoublyLinkedListNode(int data)
	{
		this.data = data;
		next = null;
		prev = null;
	}
}
class HashTableChainingDoublyLinkedList {
	// Declaration of Hash Table
	DoublyLinkedListNode[] hashTable;

	// stores the size of HashTable
	int size;

	// Constructor
	HashTableChainingDoublyLinkedList(int hashTableSize)
	{
		// Creating an empty Hash Table
		hashTable = new DoublyLinkedListNode[hashTableSize];
		size = 0;
	}

	// Function to check if hash table is empty
	public boolean isEmpty() { return size == 0; }

	// Function to clear/delete all elements from Hash table
	public void clear()
	{
		// Capacity of Hash Table
		int len = hashTable.length;

		// Creating new empty Hash Table
		// of same initial capacity
		hashTable = new DoublyLinkedListNode[len];
		size = 0;
	}

	// Function that returns size of Hash Table
	public int getSize() { return size; }

	// Function to insert a value/element
	public void insert(int value)
	{
		size++;

		// gets the position/index where the value should be
		// stored
		int position = hash(value);

		// creates a node for storing value
		DoublyLinkedListNode node
			= new DoublyLinkedListNode(value);

		DoublyLinkedListNode start = hashTable[position];

		if (hashTable[position] == null)
			hashTable[position] = node;
		else {
			node.next = start;
			start.prev = node;
			hashTable[position] = node;
		}
	}

	// Function to remove an element
	public void remove(int value)
	{
		try {
			// gets the position where the value to
			// be deleted exists
			int position = hash(value);

			DoublyLinkedListNode start
				= hashTable[position];

			DoublyLinkedListNode end = start;

			// if value is found at start
			if (start.data == value) {
				size--;
				if (start.next == null) {
					// removing the value
					hashTable[position] = null;
					return;
				}

				start = start.next;
				start.prev = null;
				hashTable[position] = start;

				return;
			}

			// traversing the list
			// until the value is found
			while (end.next != null
				&& end.next.data != value)
				end = end.next;

			// if reached at the end without finding the
			// value
			if (end.next == null) {
				System.out.println("\nElement not found\n");
				return;
			}

			size--;

			if (end.next.next == null) {
				end.next = null;
				return;
			}

			end.next.next.prev = end;
			end.next = end.next.next;

			hashTable[position] = start;
		}
		catch (Exception e) {
			System.out.println("\nElement not found\n");
		}
	}

	// Definition of Hash function
	private int hash(Integer x)
	{
		int hashValue = x.hashCode();

		hashValue %= hashTable.length;

		if (hashValue < 0)
			hashValue += hashTable.length;

		return hashValue;
	}

	// Function to print hash table
	public void printHashTable()
	{
		System.out.println();
		for (int i = 0; i < hashTable.length; i++) {
			System.out.print("At " + i + ": ");

			DoublyLinkedListNode start = hashTable[i];

			while (start != null) {
				System.out.print(start.data + " ");
				start = start.next;
			}

			System.out.println();
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		HashTableChainingDoublyLinkedList hashTab
			= new HashTableChainingDoublyLinkedList(5);

		hashTab.insert(99);
		hashTab.insert(23);
		hashTab.insert(36);
		hashTab.insert(47);
		hashTab.insert(80);

		hashTab.printHashTable();

		hashTab.insert(92);
		hashTab.insert(49);

		hashTab.printHashTable();

		hashTab.remove(99);

		hashTab.printHashTable();

		hashTab.clear();

		hashTab.printHashTable();

		System.out.println(hashTab.isEmpty());
	}
}
