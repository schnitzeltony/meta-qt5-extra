require ${BPN}.inc

inherit cmake-lib

# required
DEPENDS += " \
	${BPN}-native \
"

# optional -> TBD packageconfig
DEPENDS += " \
	kcompletion \
	kconfigwidgets \
	kiconthemes \
	kio \
	kitemviews \
	ktextwidgets \
	kwidgetsaddons \
	kxmlgui \
	sonnet \
	ki18n \
"

SRC_URI += " \
	file://0001-make-kplotting-and-kdewebkit-support-optional.patch \
	file://0002-set-kgendesignerplugin-executable-so-that-it-can-be-.patch \
"

PACKAGECONFIG ??= ""
PACKAGECONFIG[kplotting] = "-DWITH_KPLOTTING=ON,,kplotting"
PACKAGECONFIG[kdewebkit] = "-DWITH_KDEWEBKIT=ON,,kdewebkit"

# cross headers
CMAKE_ALIGN_SYSROOT[1] = "KF5DesignerPlugin, -S${includedir}, -S${STAGING_INCDIR}"

# native binaries
CMAKE_ALIGN_SYSROOT[2] = "KF5DesignerPlugin, -S${bindir}, -S${STAGING_BINDIR_NATIVE}"

FILES_${PN} += "${libdir}/plugins/designer"
FILES_${PN}-dbg += "${libdir}/plugins/designer/.debug"
