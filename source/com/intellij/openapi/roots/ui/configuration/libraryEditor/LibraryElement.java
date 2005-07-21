package com.intellij.openapi.roots.ui.configuration.libraryEditor;

import com.intellij.openapi.roots.libraries.Library;

class LibraryElement extends LibraryTableTreeContentElement {
  private final Library myLibrary;
  private final LibraryTableEditor myParentEditor;
  private final boolean myHasInvalidPaths;

  public LibraryElement(Library library, LibraryTableEditor parentEditor, final boolean hasInvalidPaths) {
    myLibrary = library;
    myParentEditor = parentEditor;
    myHasInvalidPaths = hasInvalidPaths;
  }

  public Library getLibrary() {
    return myLibrary;
  }

  public boolean isAnonymous() {
    final String name = myParentEditor.getLibraryEditor(myLibrary).getName();
    return name == null;
  }

  public boolean hasInvalidPaths() {
    return myHasInvalidPaths;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof LibraryElement)) {
      return false;
    }

    final LibraryElement libraryElement = (LibraryElement)o;


    if (!myLibrary.equals(libraryElement.myLibrary)) {
      return false;
    }

    return true;
  }

  public int hashCode() {
    return myLibrary.hashCode();
  }
}
