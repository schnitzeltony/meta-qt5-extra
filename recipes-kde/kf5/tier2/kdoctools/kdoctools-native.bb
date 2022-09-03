require ${BPN}.inc

inherit native

DEPENDS += " \
    docbook-xml-dtd4-native \
    docbook-xsl-stylesheets-native \
    libxslt-native \
    karchive-native \
    ki18n-native \
"

RDEPENDS:${PN} += "gettext-native"

SRC_URI += " \
    file://0001-don-t-build-documentation.patch \
    file://0002-Prefer-bare-xmllint.patch \
"
