require ${BPN}.inc

inherit native cmake_lib

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
	file://0003-don-t-build-documentation.patch \
"

# make meinproc5 find kdoctools data
CMAKE_ALIGN_SYSROOT[1] = "KF5DocToolsMacros.cmake, -s--stylesheet, -s--srcdir ${OE_QMAKE_PATH_DATA}/kf5/kdoctools --stylesheet"

