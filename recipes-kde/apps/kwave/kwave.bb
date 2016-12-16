SUMMARY = "Kwave is a sound editor for KDE"
LICENSE = "GPLv2 & LGPLv2 & CC-BY-SA-3.0 & GFDL-1.2 & BSD"
LIC_FILES_CHKSUM = " \
    file://LICENSES;md5=6c77bb99378a665445fdbd62703e919c \
    file://GNU-LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    audiofile \
    qtmultimedia \
    fftw \
    libopus \
    libsamplerate0 \
    \
    kcompletion \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kcrash \
    kdbusaddons \
    kdoctools \
    ki18n \
    kiconthemes \
    kio \
    kservice \
    ktextwidgets \
    kxmlgui \
    kwidgetsaddons \
"

PV = "${KDE_APP_VERSION}"
SRC_URI += "file://0001-FIND_REQUIRED_PROGRAM-is-broken-use-the-tools-direct.patch"
SRC_URI[md5sum] = "2f0234e19dc849752c8e5ba70911028f"
SRC_URI[sha256sum] = "0ee93a05de9dfcf30af5d19a7e576f4aab0457f7db5dda4af5b0156c49309d1f"

FILES_${PN} += " \
    ${datadir}/kservicetypes5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
