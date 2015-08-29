SUMMARY = "Unlock KWallet using PAM"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

REQUIRED_DISTRO_FEATURES = "pam"

inherit kde-plasma distro_features_check

DEPENDS += " \
    libpam \
    libgcrypt \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "fa968c4eecb73f4bc1cbb032d112eda9"
SRC_URI[sha256sum] = "2c32c7e471f802ac959ad5f24279f2583f79e82944411ec18c26a08f1e94b1bc"
SRC_URI += " \
    file://0001-use-pkgconfig-to-find-libgcrypt.patch \
    file://0002-fix-install-path.patch \
"

FILES_${PN} += "${libdir}/security"
FILES_${PN}-dbg += "${libdir}/security/.debug"
