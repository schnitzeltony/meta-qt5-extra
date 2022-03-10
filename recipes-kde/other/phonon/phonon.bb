SUMMARY = "The Phonon multimedia library"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-base

DEPENDS += "alsa-lib"

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "b4431ea2600df8137a717741ad9ebc7f7ec1649fa3e138541d8f42597144de2d"
PV = "4.11.1"

EXTRA_OECMAKE += " \
    -DPHONON_BUILD_DEMOS=ON \
    -DPHONON_BUILD_PHONON4QT5=ON \
    -D__KDE_HAVE_GCC_VISIBILITY=NO \
"

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'pulseaudio', d)}"
PACKAGECONFIG[designer-plugin] = "-DPHONON_BUILD_DESIGNER_PLUGIN=ON,-DPHONON_BUILD_DESIGNER_PLUGIN=OFF,qttools"
PACKAGECONFIG[pulseaudio] = "-DCMAKE_DISABLE_FIND_PACKAGE_PULSEAUDIO=FALSE -DCMAKE_DISABLE_FIND_PACKAGE_GLIB2=FALSE, -DCMAKE_DISABLE_FIND_PACKAGE_PULSEAUDIO=TRUE -DCMAKE_DISABLE_FIND_PACKAGE_GLIB2=TRUE,pulseaudio glib-2.0"

PACKAGES =+ "${PN}-designer-plugin"
FILES:${PN}-designer-plugin = "${OE_QMAKE_PATH_PLUGINS}/designer"

FILES:${PN} += "${datadir}/dbus-1"

FILES:${PN}-dev += " \
    ${datadir}/qt5/mkspecs \
    ${OE_QMAKE_PATH_ARCHDATA}/mkspecs \
    ${datadir}/phonon4qt5/buildsystem \
"
