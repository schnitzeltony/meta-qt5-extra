SUMMARY = "Simple KDE multimedia player"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=393a5ca445f6965873eca0259a17f833 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gettext

DEPENDS += " \
    phonon \
    \
    kauth-native \
    kconfig-native \
    kconfigwidgets \
    kcoreaddons-native \
    kcrash \
    kdbusaddons \
    kdoctools-native \
    sonnet-native \
    ki18n \
    kjobwidgets \
    kio \
    kparts \
    solid \
    kwidgetsaddons \
    kwindowsystem \
    kxmlgui \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "6e54b85edeb9a5aec125521713682a88"
SRC_URI[sha256sum] = "4401a65b1ccc68cd8b2366377c16e4b2d161c825a33d51feccbbbada60408487"

CXXFLAGS += "-isystem ${STAGING_INCDIR}/phonon4qt5/KDE"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/solid \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
