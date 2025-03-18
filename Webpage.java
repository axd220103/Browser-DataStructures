package edu.utdallas.cs2336;

public class Webpage {

    private Webpage leftWebpage = null;
    private Webpage rightWebpage = null;

    private Webpage parentWebpage = null;

    private final int id;
    private final String html;

    /**
     * Constructor that takes the value of this node
     * @param id ID of this webpage (used for the binary tree, mostly)
     * @param html (cached) HTML of this webpage
     */
    public Webpage(int id, String html) {
        this.id = id;
        this.html = html;
    }

    /**
     * "Copy" constructor that uses the value of another node
     * but DOES NOT copy the previous and next Nodes (as this new node shouldn't
     * be associated with the other node
     * @param other Node whose value (but not links) we want
     */
    public Webpage(Webpage other) {
        this.id = other.id;
        this.html = other.html;
    }

    /**
     * Get the previous node
     * @return The previous node, or null if there isn't one
     */
    public Webpage getLeftNode() {
        return leftWebpage;
    }

    /**
     * Set the previous node
     * @param leftWebpage New previous node; okay to be null
     */
    public void setLeftNode(Webpage leftWebpage) {
        this.leftWebpage = leftWebpage;
    }

    /**
     * Get the next node
     * @return The next node, or null if there isn't one
     */
    public Webpage getRightNode() {
        return rightWebpage;
    }

    /**
     * Set the next node
     * @param rightWebpage New next node; okay to be null
     */
    public void setRightNode(Webpage rightWebpage) {
        this.rightWebpage = rightWebpage;
    }

    /**
     * Get the node's parent (if any). Note that this is only needed for the binary tree part
     * @return The node's parent (if any)
     */
    public Webpage getParentNode() {
        return parentWebpage;
    }

    /**
     * Set the node's parent. Note that this is only needed for the binary tree part
     * @param parentWebpage The node's parent; fine if it is null
     */
    public void setParentNode(Webpage parentWebpage) {
        this.parentWebpage = parentWebpage;
    }

    /**
     * Tells you what children (if any) this node has.
     * Note that you only need this in the binary tree part
     *
     * @return The current status (NONE (this is a leaf), LEFT_ONLY, RIGHT_ONLY, or BOTH)
     */
    public ChildStatus getChildStatus() {
        if ( leftWebpage == null) {
            if ( rightWebpage == null) {
                return ChildStatus.NONE;
            } else {
                return ChildStatus.RIGHT_ONLY;
            }
        } else {
            if ( rightWebpage == null) {
                return ChildStatus.LEFT_ONLY;
            }
            return ChildStatus.BOTH;
        }
    }

    /**
     * Get the id of this page
     * @return The id of the node
     */
    public int getID() {
        return id;
    }

    /**
     * Get the HTML
     * @return HTML string
     */
    public String getHtml() {
        return html;
    }

    /**
     * We consider "equality" here to be based on value, NOT on the previous/next nodes
     * @param other The other Node to check against
     * @return Do they have equal values?
     */
    @Override
    public boolean equals(Object other) {
        if ( other instanceof Webpage) {
            final Webpage other1 = (Webpage) other;
            return (id == other1.id && html.equals(other1.html));
        }
        return false;
    }
}
