SUMMARY = "Simple KDE multimedia player"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=393a5ca445f6965873eca0259a17f833 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps gettext mime-xdg

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
SRC_URI[md5sum] = "60ec517188c9dc96eb1a5d6f44ec9c52"
SRC_URI[sha256sum] = "a804ae2089c0e96700e91d90ba2100d9a42a81a128a3fdbb037ed94c31f380cd"

CXXFLAGS += "-isystem ${STAGING_INCDIR}/phonon4qt5/KDE"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/solid \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"
