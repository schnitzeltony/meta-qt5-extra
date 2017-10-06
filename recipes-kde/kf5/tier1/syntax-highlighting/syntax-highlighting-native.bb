require ${BPN}.inc

inherit native

SRC_URI += " \
	file://0001-native-do-not-build-data-and-install-katehighlightin.patch \
"

EXTRA_OECMAKE += "-DKSYNTAXHIGHLIGHTING_USE_GUI=OFF"
