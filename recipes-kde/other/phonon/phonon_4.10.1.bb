SUMMARY = "The Phonon multimedia library"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-base

DEPENDS += "alsa-lib"

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${PV}/${BPN}-${PV}.tar.xz"
SRC_URI += " \
    file://0001-fix-PHONON_LIBRARY_PATH-was-usr-usr-lib-qt5-plugins.patch \
"
SRC_URI[md5sum] = "edb9ab608c7b74b4f0f10ebcf53e050d"
SRC_URI[sha256sum] = "e5a98df31aeffc22493afc8d6adbca5d6f0c27cc2eed73b3be05195321e08db7"

EXTRA_OECMAKE += "-DPHONON_BUILD_DEMOS=ON -DPHONON_BUILD_PHONON4QT5=ON -D__KDE_HAVE_GCC_VISIBILITY=NO"

# qml-plugin broken currently!
PACKAGECONFIG[qml-plugin] = "-DPHONON_BUILD_DECLARATIVE_PLUGIN=ON,-DPHONON_BUILD_DECLARATIVE_PLUGIN=OFF,qtquick1"
PACKAGECONFIG[designer-plugin] = "-DPHONON_BUILD_DESIGNER_PLUGIN=ON,-DPHONON_BUILD_DESIGNER_PLUGIN=OFF,qttools"
PACKAGECONFIG[pulseaudio] = "-DCMAKE_DISABLE_FIND_PACKAGE_PULSEAUDIO=FALSE -DCMAKE_DISABLE_FIND_PACKAGE_GLIB2=FALSE, -DCMAKE_DISABLE_FIND_PACKAGE_PULSEAUDIO=TRUE -DCMAKE_DISABLE_FIND_PACKAGE_GLIB2=TRUE,pulseaudio glib-2.0"

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'pulseaudio', d)}"

PACKAGES =+ "${PN}-designer-plugin-dbg ${PN}-designer-plugin"
FILES_${PN}-designer-plugin = "${OE_QMAKE_PATH_PLUGINS}/designer"
FILES_${PN}-designer-plugin-dbg = "${OE_QMAKE_PATH_PLUGINS}/designer/.debug"

FILES_${PN} += "${datadir}/dbus-1"
FILES_${PN}-dev += "${datadir}/qt5/mkspecs ${OE_QMAKE_PATH_ARCHDATA}/mkspecs ${datadir}/phonon4qt5/buildsystem"
