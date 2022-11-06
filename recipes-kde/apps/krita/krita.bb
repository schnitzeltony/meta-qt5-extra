SUMMARY = "Krita is a free digital painting application"
LICENSE = "GPL-3.0-only & BSD-3-Clause"
HOMEPAGE = "https://krita.org/"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
    file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
"

inherit kde-apps python3native gtk-icon-cache mime-xdg

DEPENDS += " \
    qtmultimedia \
    quazip \
    curl \
    poppler \
    boost \
    libraw \
    libeigen \
    exiv2 \
    fftw \
    giflib \
    gsl \
    \
    kauth-native \
    karchive \
    kconfig-native \
    kwidgetsaddons \
    kcompletion \
    kcoreaddons-native \
    kguiaddons \
    ki18n \
    kitemmodels \
    kitemviews \
    kwindowsystem \
    kio \
    kcrash \
    libmypaint \
"

PV = "5.1.3"
PVEXT = ""
SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${PV}/${BPN}-${PV}${PVEXT}.tar.xz"
SRC_URI[sha256sum] = "896e6455baf1110b3572340e164fc80651bbc72f7149c2276fafcc08ac94d8cc"
S = "${WORKDIR}/${BPN}-${PV}${PVEXT}"

EXTRA_OECMAKE += " \
   -DTIFF_CAN_WRITE_PSD_TAGS_EXITCODE=0 \
   -DTIFF_CAN_WRITE_PSD_TAGS_EXITCODE__TRYRUN_OUTPUT=0 \
"

FILES:${PN} += " \
    ${datadir}/color \
    ${datadir}/color-schemes \
    ${datadir}/icons \
    ${datadir}/kritaplugins \
    ${libdir}/kritaplugins \
    ${OE_QMAKE_PATH_QML}/org/krita \
"
