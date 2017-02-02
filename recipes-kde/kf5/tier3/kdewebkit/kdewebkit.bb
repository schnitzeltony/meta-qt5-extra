SUMMARY = "KDE Integration for QtWebKit"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += " \
    qtwebkit \
    kconfig \
    kcoreaddons \
    kio \
    kjobwidgets \
    kparts \
    kservice \
    kwallet \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "92cbcec3a68a39507d515fe16ab382d1"
SRC_URI[sha256sum] = "7373e60d34079019359bb864cf5d0adc4278c310f29926bbfb7b6bc1f5f503e7"
