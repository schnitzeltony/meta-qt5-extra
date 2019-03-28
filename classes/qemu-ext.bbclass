inherit qemu

DEPENDS += "qemu-native"

# This is an extended/modified qemu.bbclass tailored four our needs:
#
# * add qemu-native to DEPENDS: we can do that because there is no
#   introspection/interception delayed qemu usage here
# * The executable binary is set by absolute path: oe-core's qemu.bbclass
#   expects it in sysroot. Here we usually run binaries in builddir which are
#   not yet installed.
# * A recipe can set an extra library path in 'QEMU_EXTRA_LIBDIR'. This path is
#   an absolute path.

def qemu_run_binary_local(data, rootfs_path, binary):
    libdir = rootfs_path + data.getVar("libdir")
    base_libdir = rootfs_path + data.getVar("base_libdir")
    extra_libdir = data.getVar("QEMU_EXTRA_LIBDIR")
    if extra_libdir:
        return qemu_wrapper_cmdline(data, rootfs_path, [libdir, base_libdir, extra_libdir]) + binary
    else:
        return qemu_wrapper_cmdline(data, rootfs_path, [libdir, base_libdir]) + binary
