require ${BPN}.inc

inherit native

DEPENDS += " \
    libxslt-native \
    libxml2-native \
    karchive-native \
    ki18n-native \
    liburi-perl-native \
    docbook-xml-dtd4-native \
    docbook-xsl-stylesheets-native \
"
RDEPENDS_${PN} += "gettext-native"

SRC_URI += " \
	file://0001-don-t-build-documentation.patch \
"
