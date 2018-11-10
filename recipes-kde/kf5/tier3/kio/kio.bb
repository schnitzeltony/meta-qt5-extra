SUMMARY = "Resource and network access abstraction"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake_auto_align_paths gettext

DEPENDS += " \
    qttools-native \
    karchive \
    kcodecs \
    kconfig-native \
    kcoreaddons-native \
    kdbusaddons \
    kdoctools-native \
    ki18n \
    knotifications \
    kservice \
    solid \
    kxmlgui \
    kwallet \
    kauth-native \
    sonnet-native \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "8f1fd180c66f13fe27567608347042cb"
SRC_URI[sha256sum] = "acb05d730f057a81a263d1b217019ffadc276929462c54add202de44313524a1"

SRC_URI += "file://0001-Extend-upstream-workaround-for-bug-371721-to-also-co.patch"

PACKAGECONFIG[full] = "-DKIOCORE_ONLY=OFF,-DKIOCORE_ONLY=ON, kbookmarks kcompletion kconfigwidgets kiconthemes kitemviews kjobwidgets kwidgetsaddons kwindowsystem"
# Note that kdeclarative fails without KIOWidgets
PACKAGECONFIG ??= "full"

# REVISIT make optional
DEPENDS += " \
    krb5 \
"

do_configure_append() {
    # fix sysroot path
    sed -i 's:${STAGING_BINDIR_NATIVE}:${bindir}:g' ${B}/src/ioslaves/help/config-help.h
}

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/k*5 \
    ${datadir}/polkit-1 \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_PLUGINS} \
"
