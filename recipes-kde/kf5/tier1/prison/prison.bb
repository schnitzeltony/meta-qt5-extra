SUMMARY = "Barcode abstraction layer"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=02744127548d68b579a51bda5af08e2b \
"

inherit kde-kf5

DEPENDS += " \
    qrencode \
    libdmtx \
"

SRC_URI[md5sum] = "74276d9a4c8bf369187aa138301a71da"
SRC_URI[sha256sum] = "6613decb2e0b61af5af3a3a9995970c2fdaa72f36bcfd7e9db547017ee4ca235"

PV = "${KF5_VERSION}"
