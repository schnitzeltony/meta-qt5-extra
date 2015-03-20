require ${BPN}.inc

inherit native cmake-lib

DEPENDS += "libxslt-native libxml2-native karchive-native ki18n-native"

SRC_URI += " \
	file://0003-install-docbookl10nhelper-we-need-the-native-one-for.patch \
	file://0004-don-t-build-documentation.patch \
"

# make meinproc5 find kdoctools data
CMAKE_ALIGN_SYSROOT[1] = "KF5DocToolsMacros.cmake, -s--stylesheet, -S--srcdir ${STAGING_DATADIR_NATIVE}/kf5/kdoctools --stylesheet"

