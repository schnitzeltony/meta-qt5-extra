require ${BPN}.inc

inherit native

SRC_URI += " \
	file://0001-native-install-katehighlightingindexer-onl.patch \
"

EXTRA_OECMAKE += "-DKSYNTAXHIGHLIGHTING_USE_GUI=OFF"
