module org.jboss.modules {
        requires java.desktop; // Used for java.beans
        requires java.instrument;
        requires java.logging;
        requires java.management;
        requires java.prefs;
        requires java.xml;

        exports org.jboss.modules;
        exports __redirected;
}