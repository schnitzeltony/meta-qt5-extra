SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5dd311e62bbebe45e5f816f8b18461b4"
SRC_URI[sha256sum] = "bfabe42cf4e667cabaa2754ea80decd4a53cff769951a530e0f218f9f42e695e"
