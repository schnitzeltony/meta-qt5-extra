require ${BPN}.inc

inherit native

DEPENDS += "libxslt-native libxml2-native karchive-native ki18n-native"

SRC_URI += " \
	file://0003-install-docbookl10nhelper-we-need-the-native-one-for.patch \
	file://0004-don-t-build-documentation.patch \
"
