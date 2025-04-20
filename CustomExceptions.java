//Name- Manan Khanna
//AIML B3
//23070126156
// Custom Exceptions

class StudentAlreadyExistsException extends Exception {
    public StudentAlreadyExistsException(String message) {
        super(message);
    }
}

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

class EmptyStudentListException extends Exception {
    public EmptyStudentListException(String message) {
        super(message);
    }
}

class InvalidPositionException extends Exception {
    public InvalidPositionException(String message) {
        super(message);
    }
}

class InvalidPRNException extends Exception {
    public InvalidPRNException(String message) {
        super(message);
    }
}

