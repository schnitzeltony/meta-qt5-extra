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
SRC_URI[md5sum] = "9a70ddcbaac7d92f01a1d4e25edb2018"
SRC_URI[sha256sum] = "a15c1fe1f8b9dc3be2600b93876bbb15cb28cf65a935c066065c516518fabe54"
SRC_URI += " \
    file://0001-use-pkgconfig-to-find-libgcrypt.patch \
    file://0002-fix-install-path.patch \
"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_LIBDIR=${base_libdir}"

FILES_${PN} += "${base_libdir}/security"
FILES_${PN}-dbg += "${base_libdir}/security/.debug"
