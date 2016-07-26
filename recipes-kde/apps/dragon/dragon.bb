SUMMARY = "Simple KDE multimedia player"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=393a5ca445f6965873eca0259a17f833 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps

DEPENDS += " \
    phonon \
    \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kcrash \
    kdbusaddons \
    kdoctools \
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
SRC_URI[md5sum] = "2c0a3e8a3d8ef098930da4fe9668b672"
SRC_URI[sha256sum] = "749f31ac966a97329c05b9b2e68fee216d0ee3cd0a90a8957171385907cc10b5"

CXXFLAGS += "-isystem ${STAGING_INCDIR}/phonon4qt5/KDE"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/solid \
    ${datadir}/icons \
    ${datadir}/appdata \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"
