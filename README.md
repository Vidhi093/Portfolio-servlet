
### Documentation for `Login.java`

**Purpose:**
The `Login` servlet handles user authentication by checking the provided username and password. If the credentials are valid, it redirects the user to the "Message" page; otherwise, it displays an error toast and includes the login form.

**Usage:**
This servlet is mapped to the "/loginform" URL.

**Dependencies:**
- HTML: `login.html`
- CSS: Styling for the error toast
- JavaScript: Toast animation and removal functionality

**Important Components:**
- `doPost(HttpServletRequest req, HttpServletResponse resp)`: Handles the form submission, checks credentials, and either redirects or displays an error.

### Documentation for `Message.java`

**Purpose:**
The `Message` servlet generates the "Message" page, displaying a list of messages submitted through a form.

**Usage:**
This servlet is mapped to the "/Message" URL.

**Dependencies:**
- HTML: None
- CSS: Styles for the message display
- Data: `Utility` class for retrieving and displaying messages

**Important Components:**
- `doGet(HttpServletRequest req, HttpServletResponse resp)`: Renders the "Message" page with submitted messages.

### Documentation for `ProjectRedirect.java`

**Purpose:**
The `ProjectRedirect` servlet redirects the user to a specified page based on the "page" parameter in the URL.

**Usage:**
This servlet is mapped to the "/Project" URL.

**Dependencies:**
- None

**Important Components:**
- `doGet(HttpServletRequest req, HttpServletResponse resp)`: Retrieves the "page" parameter and redirects the user.

### Documentation for `Utility.java`

**Purpose:**
The `Utility` class represents a utility object containing information such as name, email, message, and a timestamp.

**Usage:**
Used to store and retrieve utility objects, likely representing messages submitted through a form.

**Important Components:**
- Fields: `name`, `email`, `msg`, `dateTime`
- Methods: 
  - `getUtilities()`, `setUtilities(List<Utility> utilities)`: Accessor methods for the static list of utilities.
  - `getFormattedTimestamp()`: Formats the timestamp for display.

### Documentation for HTML and CSS Files

**HTML Files :**
- Purpose: Contain the structure and content for login and various informational pages.
- Usage: Rendered by servlets or accessed directly through the browser.
- Dependencies: CSS files, Font Awesome library.
- Important Components: Form elements, navigation links, content sections.

**CSS Files :**
- Purpose: Provide styles for enhancing the visual presentation of HTML pages.
- Usage: Applied to HTML elements to achieve a consistent and aesthetically pleasing layout.
- Dependencies: None for inline styles in servlets; external CSS file for general styling.
- Important Components: Styles for headers, menu sections, grid items, and various interactive elements.
